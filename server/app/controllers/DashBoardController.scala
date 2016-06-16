package controllers

import javax.inject.{Inject, Singleton}

import akka.actor.ActorSystem
import play.api.Environment
import play.api.mvc.{Action, Controller}

import scala.concurrent.ExecutionContext

@Singleton
class DashBoardController @Inject()(webJarAssets : WebJarAssets, system: ActorSystem, env : Environment)(implicit ec:ExecutionContext) extends Controller {

  def index = Action {
    Ok(views.html.dashboard(webJarAssets))
  }

}
