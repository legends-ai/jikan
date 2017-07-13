name := "jikan"
scalaVersion := "2.12.2"

enablePlugins(
  AssemblyPlugin,
  BuildInfoPlugin,
  DockerPlugin,
  GitVersioning
)

libraryDependencies ++= Seq(
  "asuna" %% "common" % "4.1.59",
  "ch.qos.logback" % "logback-classic" % "1.1.9",
  "net.logstash.logback" % "logstash-logback-encoder" % "4.8"
)
