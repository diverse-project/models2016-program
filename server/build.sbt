name := """models2016-program"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test,
  "org.webjars" %% "webjars-play" % "2.5.0",
  "org.webjars.npm" % "jquery" % "2.2.4",
  "org.webjars.npm" % "bootstrap" % "3.3.6",
  "org.webjars.npm" % "angular" % "1.5.5"
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"
