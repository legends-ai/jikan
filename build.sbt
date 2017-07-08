name := "jikan"
scalaOrganization := "org.typelevel"
scalaVersion := "2.12.2-bin-typelevel-4"

enablePlugins(
  AssemblyPlugin,
  BuildInfoPlugin,
  DockerPlugin,
  GitVersioning
)

libraryDependencies ++= Seq(
  "asuna" %% "common" % "4.1.56",
  "ch.qos.logback" % "logback-classic" % "1.1.9",
  "net.logstash.logback" % "logstash-logback-encoder" % "4.8"
)
