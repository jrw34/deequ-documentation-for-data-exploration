ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.10"

resolvers += "Maven Central" at "https://repo1.maven.org/maven2/"

lazy val root = (project in file("."))
  .settings(
    name := "deequ-docs-for-ds"
  )
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.5.6",
  "org.apache.spark" %% "spark-sql" % "3.5.6",
  "org.apache.spark" %% "spark-mllib" % "3.5.6"
)
libraryDependencies += "com.amazon.deequ" % "deequ" % "2.0.12-spark-3.5"

