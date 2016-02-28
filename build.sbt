name := "jsonparser-explorations-scala"

version := "0.1"

scalaVersion := "2.11.7"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked")

// newer versions seem to be incompatible with Java 1.7
libraryDependencies += "com.typesafe.play" %% "play-json" % "2.4.6"
