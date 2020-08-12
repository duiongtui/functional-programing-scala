val commonSettings = Seq(
  name := "fp",
  scalaVersion := "2.13.1"
)

lazy val cats = "org.typelevel" %% "cats-core" % "2.0.0"

val dependencies = Seq()
lazy val fp = (project in file("code"))
  .enablePlugins(JavaAppPackaging)
  .settings(
    commonSettings,
    libraryDependencies ++= dependencies
  )
