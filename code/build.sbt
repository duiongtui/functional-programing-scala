val commonSettings = Seq(
  name := "fp",
  scalaVersion := "2.12.10"
)

lazy val cats = "org.typelevel" %% "cats-core" % "2.0.0"

val dependencies = Seq()
lazy val fp = (project in file("."))
  .enablePlugins(JavaAppPackaging)
  .settings(
    commonSettings,
    libraryDependencies ++= dependencies
  )