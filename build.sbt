
scalaVersion in ThisBuild := "2.11.8"

version in ThisBuild := "0.1.0-SNAPSHOT"

val globalSettings = Seq(
  name := "cron4s",
  organization := "com.github.alonsodomin",
  scalacOptions ++= Seq(
    "-language:postfixOps",
    "-feature",
    "-unchecked",
    "-deprecation",
    "-Xfuture",
    "-Ywarn-dead-code",
    "-language:implicitConversions",
    "-language:higherKinds",
    "-language:existentials"
  )
)

lazy val cron4s = (crossProject in file(".")).
  settings(globalSettings: _*).
  settings(
    libraryDependencies ++= Seq(
      compilerPlugin("org.scalamacros" % "paradise"       % "2.1.0" cross CrossVersion.full),
      compilerPlugin("org.spire-math"  % "kind-projector" % "0.8.0" cross CrossVersion.binary),

      "com.github.mpilquist" %%% "simulacrum" % "0.7.0",
      "org.typelevel"        %%% "cats"       % "0.6.0",
      "org.scalacheck"       %%% "scalacheck" % "1.12.5" % Test
    )
  ).jsSettings(
    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scala-parser-combinators" % "1.0.2"
    )
  ).jvmSettings(
    libraryDependencies ++= Seq(
      "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.2"
    )
  )

lazy val cron4sJS = cron4s.js
lazy val cron4sJVM = cron4s.jvm

initialCommands in console := "import cron4s.core._, cron4s.expr._, cron4s.matcher._, CronField._, cron4s._"