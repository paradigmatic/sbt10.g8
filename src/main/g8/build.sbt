organization := "$organization$"

name := "$name$"

version := "$version$"

scalaVersion := "2.10.0"

crossScalaVersions := Seq("2.9.2" )

libraryDependencies ++= Seq(
  "com.typesafe" %% "scalalogging-slf4j" % "1.0.0",
  "org.scalatest" % "scalatest_2.10.0" % "2.0.M5b" % "test"
)

scalacOptions ++= Seq("-deprecation", "-feature")

scalaSource in Compile <<= baseDirectory(_ / "src")

scalaSource in Test <<= baseDirectory(_ / "test")

