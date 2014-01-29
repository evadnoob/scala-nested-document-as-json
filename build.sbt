
name := "scala-nested-document-as-json"

version := "1.0"

scalaVersion := "2.10.3"

exportJars := true

unmanagedClasspath in Runtime += baseDirectory.value / "src/main/resources"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.2.3",
  "io.spray" % "spray-client" % "1.2.0",
  "io.spray" % "spray-routing" % "1.2.0",
  "io.spray" % "spray-can" % "1.2.0",
  "io.spray" % "spray-caching" % "1.2.0",
  "io.spray" %% "spray-json" % "1.2.5",
  "junit" % "junit" % "4.8.1" % "test",
  "org.scalatest" %% "scalatest" % "2.0" % "test",
  //"org.specs2" %% "specs2" % "2.3.7" % "test",
  "org.mongodb" %% "casbah" % "2.5.0",
  "net.liftweb" %% "lift-util" % "2.5.1",
  "net.liftweb" %% "lift-common" % "2.5.1",
  "net.liftweb" %% "lift-record" % "2.5.1",
  "net.liftweb" %% "lift-mongodb-record" % "2.5.1",
  "net.liftweb" %% "lift-mongodb" % "2.5.1",
  "net.liftweb" %% "lift-webkit" % "2.5.1",
  "net.liftweb" %% "lift-json" % "2.5.1",
  "com.foursquare" %% "rogue-core" % "2.2.0",
  "com.foursquare" %% "rogue-lift" % "2.2.0",
  "net.debasishg" %% "sjson" % "0.19",
  "com.typesafe" %% "scalalogging-slf4j" % "1.0.1",
  "org.slf4j" % "slf4j-api" % "1.7.5",
  "org.apache.logging.log4j" % "log4j-slf4j-impl" % "2.0-beta9",
  "org.apache.logging.log4j" % "log4j-api" % "2.0-beta9",
  "org.apache.logging.log4j" % "log4j-core" % "2.0-beta9",
  "com.github.nscala-time" %% "nscala-time" % "0.6.0",
  "com.decodified" %% "scala-ssh" % "0.6.4",
  "org.bouncycastle" % "bcprov-jdk16" % "1.46",
  "com.jcraft" % "jzlib" % "1.1.2",
  "com.propensive" % "rapture-io" % "0.8.1" from "http://rapture.io/download/io-0.8.1.jar",
  "com.sksamuel.elastic4s" %% "elastic4s" % "0.90.10.0"
)

resolvers += "spray repo" at "http://repo.spray.io"

resolvers ++= Seq("snapshots", "releases").map(Resolver.sonatypeRepo)


