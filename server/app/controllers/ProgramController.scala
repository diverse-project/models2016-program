package controllers

import java.io.{File, FileInputStream}
import java.util.UUID
import javax.inject._

import akka.actor.ActorSystem
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.{DeserializationFeature, ObjectMapper}
import play.api.Environment
import play.api.libs.json.{JsArray, JsObject, JsValue, Json}
import play.api.mvc._
import services.CustomCalendarActor
import services.CustomCalendarActor.{GetCalendar, RemoveCalendar, SetCalendar}

import scala.collection.mutable
import scala.concurrent.duration._
import scala.concurrent.{ExecutionContext, Future}
import scala.io.Source
import akka.pattern.ask
import akka.util.Timeout

@Singleton
class ProgramController @Inject()(webJarAssets : WebJarAssets, system: ActorSystem, env : Environment)(implicit ec:ExecutionContext) extends Controller {

  val dataFile = new File("/var/models2016/data.js")

  def programData : JsValue = {
    val content = Source.fromFile(dataFile).mkString.substring("var data = ".size)
    Json.parse(content)
  }

  val customCalendarActor = system.actorOf(CustomCalendarActor.props, "custom-calendar")
  implicit val timeout = Timeout(5.seconds)

  def index = Action {
    Ok(views.html.index(webJarAssets))
  }

  def data = Action {
    Ok.sendFile(dataFile)
  }


  def generateIcalEvent(event : JsObject, session : JsObject, start: String, end : String, title: String, favorites : Option[Map[String, Boolean]]) : List[String] = {

    val room = (session \ "room").as[String]
    val eventAbstract = (event \ "abstract").asOpt[String]
    val authors = (event \ "authors").asOpt[List[JsObject]]
      .map(opt => opt.map(a => (a \ "name").as[String]).mkString(", "))
    val organizers = (event \ "organizers").asOpt[List[JsObject]]
      .map(opt => opt.map(a => (a \ "name").as[String]).mkString(", "))
    val url = (event \ "url").asOpt[String]

    val description = List(
      Some(title),
      authors.map(a => "authors: " + a),
      organizers.map(a => "organizers: " + a),
      eventAbstract.map (a => "abstract: " + a.replaceAll("\n", ""))
    )
//    val description = List(Some(title))

    var icsEvent = List.empty[String]
    icsEvent ::= "BEGIN:VEVENT"
    icsEvent ::= "DTSTART:" + start
    icsEvent ::= "DTEND:" + end
    icsEvent ::= "DTSTAMP:" + start
//    icsEvent ::= "ORGANIZER;CN=models2016-gc@inria.fr:mailto:models2016-gc@inria.fr"
    icsEvent ::= "UID:" + start + "-"  + title.hashCode + "@models.irisa.fr"
    icsEvent ::= ("DESCRIPTION:" + description.flatten.mkString("\\n")).grouped(75).mkString("\r\n ") // max length for a line is 75 characters
    icsEvent ::= "LOCATION:" + room
    icsEvent ::= ("SUMMARY:" + title).grouped(75).mkString("\r\n ") // max length for a line is 75 characters
    icsEvent ::= "END:VEVENT"
    icsEvent
  }


  def generateIcalCalendar(favoriteEvents : Option[JsValue]): String = {
    val favorites = favoriteEvents.map{m => m.as[Map[String, Boolean]]}

    var ical = List.empty[String]
    ical ::= "BEGIN:VCALENDAR"
    ical ::= "VERSION:2.0"
    ical ::= "PRODID:-//MODELS2016//Program"

    val days = programData.as[List[JsObject]]

    for (day <- days) {
      val sessionGroups = (day \ "sessionGroups").get.as[List[List[JsObject]]]

      for (sessionGroup <- sessionGroups if sessionGroup.nonEmpty) {
        for (session <- sessionGroup) {

          val events = (session \ "events").asOpt[List[JsObject]]
          if (events.isDefined) {
            for (event <- events.get) {
              val papers = (event \ "papers").asOpt[List[JsObject]]
              if (papers.isDefined) {
                for (paper <- papers.get) {
                  val start = (paper \ "icalStart").as[String]
                  val end = (paper \ "icalEnd").as[String]
                  val title = (paper \ "title").as[String]

                  if (favorites.isEmpty || favorites.get.getOrElse(title + start, false)) {
                    ical :::= generateIcalEvent(paper, session, start, end, title, favorites)
                  }
                }
              } else {
                val start = (session \ "icalStart").as[String]
                val end = (session \ "icalEnd").as[String]
                val title = (event \ "title").as[String]
                if (favorites.isEmpty || favorites.get.getOrElse(title + start, false)) {
                  ical :::= generateIcalEvent(event, session, start, end, title, favorites)
                }
              }
            }
          }
        }
      }
    }

    ical ::= "END:VCALENDAR"
    ical.reverse.mkString("\n")
  }

  def getCompleteIcal() = Action {
    Ok(generateIcalCalendar(None)).withHeaders("type" -> "text/calendar")
  }


  def generateIcal() = Action.async { request =>
    request.body.asJson.map { data =>

      val id = UUID.randomUUID().toString
      val ical = generateIcalCalendar(Some(data))
      customCalendarActor ! SetCalendar(id, ical)

      Future.successful(Ok(id))
    }.getOrElse {
      Future.successful(BadRequest("cannot generate ics file"))
    }

  }

  def getIcal(id : String) = Action.async { request =>
    val android = request.headers.get("user-agent").exists(userAgent => userAgent.contains("Android"))

    (customCalendarActor ? GetCalendar(id)).map {
      case customCalendar : String =>
        if (android) {
          akka.pattern.after(3.minutes, using = system.scheduler)(Future{
            customCalendarActor ! RemoveCalendar(id)
          })
        } else {
          customCalendarActor ! RemoveCalendar(id)
        }
        Ok(customCalendar).withHeaders("type" -> "text/calendar")
      case _ => NotFound("ics file not found")
    }
  }



}
