ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.7"

lazy val root = (project in file("."))
  .settings(
    name := "sbt-dependency-updates-test"
  )

libraryDependencies += "org.mongodb.scala" %% "mongo-scala-driver" % "4.4.0"
