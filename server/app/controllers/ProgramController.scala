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

  val programData = Json.parse(Source.fromInputStream(env.resourceAsStream("public/javascripts/data.js").get).mkString.substring("var data = ".size))

  val customCalendarActor = system.actorOf(CustomCalendarActor.props, "custom-calendar")
  implicit val timeout = Timeout(5.seconds)

  def index = Action {
    Ok(views.html.index(webJarAssets))
  }


  def generateIcalEvent(start: String, end: String, title: String, description: String, location: String) : List[String] = {
    var event = List.empty[String]
    event ::= "BEGIN:VEVENT"
    event ::= "DTSTART:" + start
    event ::= "DTEND:" + end
    event ::= "DTSTAMP:" + start
    event ::= "ORGANIZER;CN=models2016-gc@inria.fr:mailto:models2016-gc@inria.fr"
    event ::= "UID:" + start + "-"  + title.hashCode + "@models.irisa.fr"
    event ::= "DESCRIPTION:" + description // TODO : max line is 75 characters
    event ::= "LOCATION:" + location
    event ::= "SUMMARY:" + title // TODO : max line is 75 characters
    event ::= "END:VEVENT"
    event
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
                  val selected = (paper \ "selected").asOpt[Boolean].getOrElse(false)
                  val start = (paper \ "icalStart").as[String]
                  val title = (paper \ "title").as[String]

                  if (!favorites.isDefined || favorites.get.getOrElse(title + start, false)) {

                    val end = (paper \ "icalEnd").as[String]

                    val room = (session \ "room").as[String]
                    ical :::= generateIcalEvent(start, end, title, title, room); // TODO : description
                  }
                }
              } else {
                val start = (session \ "icalStart").as[String]
                val title = (event \ "title").as[String]
                if (!favorites.isDefined || favorites.get.getOrElse(title + start, false)) {

                  val end = (session \ "icalEnd").as[String]

                  val room = (session \ "room").as[String]
                  ical :::= generateIcalEvent(start, end, title, title, room); // TODO : description
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
