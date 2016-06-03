package services

import akka.actor.{Actor, Props}
import akka.actor.Actor.Receive

import scala.collection.mutable

/**
  * Created by gbecan on 03/06/16.
  */
class CustomCalendarActor extends Actor {

  import CustomCalendarActor._

  var customCalendars : Map[String, String] = Map.empty

  override def receive: Receive = {
    case GetCalendar(id : String) => sender() ! customCalendars(id)
    case SetCalendar(id : String, data : String) => customCalendars += id -> data
    case RemoveCalendar(id : String) => customCalendars -= id
  }
}

object CustomCalendarActor {
  def props = Props[CustomCalendarActor]

  case class GetCalendar(id : String)
  case class SetCalendar(id : String, data : String)
  case class RemoveCalendar(id : String)
}
