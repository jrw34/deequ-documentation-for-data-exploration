ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.16"

lazy val root = (project in file("."))
  .settings(
    name := "deequ-docs-for-ds"
  )
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "4.0.0",
  "org.apache.spark" %% "spark-sql" % "4.0.0",
)

