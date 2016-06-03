package controllers

import java.io.{File, FileInputStream}
import java.util.UUID
import javax.inject._

import akka.actor.ActorSystem
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.{DeserializationFeature, ObjectMapper}
import play.api.libs.json.{JsArray, JsObject, JsValue, Json}
import play.api.mvc._

import scala.collection.mutable
import scala.concurrent.duration._
import scala.concurrent.{ExecutionContext, Future}
import scala.io.Source


@Singleton
class ProgramController @Inject()(webJarAssets : WebJarAssets, system: ActorSystem)(implicit ec:ExecutionContext) extends Controller {

  val programDataFile = new File("public/javascripts/data.js")
  val programData = Json.parse(Source.fromFile(programDataFile).mkString.substring("var data = ".size))
  val customCalendars : mutable.Map[String, String] = mutable.Map.empty

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


  def generateIcalCalendar(data : Option[JsValue]): String = {
    var ical = List.empty[String]

    val favoritesOnly = data.isDefined
    val program = data.getOrElse(programData)
    val days = program.as[List[JsObject]]

    ical ::= "BEGIN:VCALENDAR"
    ical ::= "VERSION:2.0"
    ical ::= "PRODID:-//MODELS2016//Program"

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
                  if (!favoritesOnly || selected) {
                    val start = (paper \ "icalStart").as[String]
                    val end = (paper \ "icalEnd").as[String]
                    val title = (paper \ "title").as[String]
                    val room = (session \ "room").as[String]
                    ical :::= generateIcalEvent(start, end, title, title, room); // TODO : description
                  }
                }
              } else {
                val selected = (event \ "selected").asOpt[Boolean].getOrElse(false)
                if (!favoritesOnly || selected) {
                  val start = (session \ "icalStart").as[String]
                  val end = (session \ "icalEnd").as[String]
                  val title = (event \ "title").as[String]
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
      customCalendars.put(id, ical)

      Future.successful(Ok(id))
    }.getOrElse {
      Future.successful(BadRequest("cannot generate ics file"))
    }

  }

  def getIcal(id : String) = Action { request =>
    val android = request.headers.get("user-agent").exists(userAgent => userAgent.contains("Android"))

    println(id)
    println(customCalendars.keys)
    println(customCalendars.get(id).isDefined)
    println("android = " + android)

    customCalendars.get(id).map { customCalendar =>
      if (android) {
        akka.pattern.after(3.minutes, using = system.scheduler)(Future{
          customCalendars.remove(id) // FIXME : not thread safe
          println("removed")
        })
      } else {
        customCalendars.remove(id) // FIXME : not thread safe
      }

      Ok(customCalendar).withHeaders("type" -> "text/calendar")
    }.getOrElse {
      NotFound("custom ics not found")
    }
  }



}
