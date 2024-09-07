import sbtcrossproject.{ CrossType, crossProject }

val Scala213V = "2.13.14"
val Scala3V = "3.3.3"
val Scala212V = "2.12.19"

val circeVersion = "0.14.9"

val munitVersion = "1.0.1"
val munitScalacheckV = "1.0.0"
val disciplineMunitVersion = "2.0.0"
val refinedV = "0.11.2"

ThisBuild / tlBaseVersion := "0.15"
ThisBuild / tlCiReleaseTags := true

ThisBuild / organization := "io.circe"
ThisBuild / crossScalaVersions := List(Scala213V, Scala212V, Scala3V)
ThisBuild / scalaVersion := Scala213V

ThisBuild / githubWorkflowJavaVersions := Seq("8", "17").map(JavaSpec.temurin)

ThisBuild / tlCiScalafmtCheck := true
ThisBuild / circeRootOfCodeCoverage := Some("rootJVM")

lazy val root =
  tlCrossRootProject.aggregate(refined)

lazy val refined = crossProject(JSPlatform, JVMPlatform, NativePlatform)
  .in(file("refined"))
  .settings(
    moduleName := "circe-refined",
    libraryDependencies ++= Seq(
      "io.circe" %%% s"circe-core" % circeVersion,
      "io.circe" %%% s"circe-testing" % circeVersion % Test,
      "eu.timepit" %%% "refined" % refinedV,
      "eu.timepit" %%% "refined-scalacheck" % refinedV % Test,
      "org.scalameta" %%% "munit" % munitVersion % Test,
      "org.scalameta" %%% "munit-scalacheck" % munitScalacheckV % Test,
      "org.typelevel" %%% "discipline-munit" % disciplineMunitVersion % Test
    )
  )
  .jvmSettings()
  .jsSettings()
  .nativeSettings()

ThisBuild / startYear := Some(2024)
ThisBuild / developers := List(
  Developer("travisbrown", "Travis Brown", "travisrobertbrown@gmail.com", url("https://twitter.com/travisbrown")),
  Developer("zmccoy", "Zach McCoy", "zachabbott@gmail.com", url("https://twitter.com/zachamccoy")),
  Developer("zarthross", "Darren Gibson", "zarthross@gmail.com", url("https://twitter.com/zarthross")),
  Developer("hamnis", "Erlend Hamnaberg", "erlend@hamnaberg.net", url("https://github.com/hamnis"))
)
