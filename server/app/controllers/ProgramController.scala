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
  val programData = Source.fromFile(programDataFile).mkString.substring("var data = ".size)
  val customCalendars : mutable.Map[String, String] = mutable.Map.empty

  def index = Action {
    Ok(views.html.index(webJarAssets))
  }


  def generateIcalContent(data : Option[JsValue]): String = {
    var ical = List.empty[String]

    val mapper = play.libs.Json.newDefaultMapper().enable(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES)
    play.libs.Json.setObjectMapper(mapper)

//    val program = play.libs.Json.parse(programData)

    val program = data.getOrElse(Json.parse(programData))
    val days = program.as[List[JsObject]]

    ical ::= "BEGIN:VCALENDAR"
    ical ::= "VERSION:2.0"
    ical ::= "PRODID:-//MODELS2016//Program"

    for (day <- days) {
      println(day)
    }


    //     $scope.data.forEach(function(day) {
    //
    //         day.sessionGroups.forEach(function(sessionGroup) {
    //             if (sessionGroup.length > 0) {
    //                 sessionGroup.forEach(function (session, roomIndex) {
    //                     if (typeof session.events !== "undefined") {
    //                         session.events.forEach(function (event, eventIndex) {
    //
    //                             if (typeof event.papers === "undefined") {
    //
    //                                 if (!favoritesOnly || ((typeof event.selected !== "undefined") && event.selected === true)) {
    //                                     createEvent(calendar, session.icalStart, session.icalEnd, event.title, event.title, session.room); // TODO : description
    //                                 }
    //                             } else {
    //                                 event.papers.forEach(function(talk, talkIndex) {
    //                                     if (!favoritesOnly || ((typeof talk.selected !== "undefined") && talk.selected === true)) {
    //                                         createEvent(calendar, talk.icalStart, talk.icalEnd, talk.title, talk.title, session.room); // TODO : description
    //                                     }
    //                                 });
    //                             }
    //
    //
    //                         });
    //                     }
    //                 });
    //             }
    //         });
    //     });


    // function createEvent(calendar, start, end, title, description, location) {
    //     calendar.push("BEGIN:VEVENT");
    //     calendar.push("DTSTART:" + start);
    //     calendar.push("DTEND:" + end);
    //     calendar.push("DTSTAMP:" + start);
    //     calendar.push("ORGANIZER;CN=models2016-gc@inria.fr:mailto:models2016-gc@inria.fr");
    //     calendar.push("UID:" + start + "-"  + hash(title) + "@models.irisa.fr");
    //     calendar.push("DESCRIPTION:" + description); // TODO : max line is 75 characters
    //     calendar.push("LOCATION:" + location);
    //     calendar.push("SUMMARY:" + title); // TODO : max line is 75 characters
    //     calendar.push("END:VEVENT");

    ical ::= "BEGIN:VEVENT"


    ical ::= "END:VEVENT"

    ical ::= "END:VCALENDAR"
    ical.reverse.mkString("\n")
  }

  def getCompleteIcal() = Action {
    Ok(generateIcalContent(None)).withHeaders("type" -> "text/calendar")
  }


  def generateIcal() = Action.async { request =>
    request.body.asJson.map { data =>

      val id = UUID.randomUUID().toString
      val ical = generateIcalContent(Some(data))
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
