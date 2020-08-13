val commonSettings = Seq(
  name := "fp",
  scalaVersion := "2.13.1"
)

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.0"

lazy val fp = (project in file("."))
  .enablePlugins(JavaAppPackaging)
  .settings(
    commonSettings
  )
