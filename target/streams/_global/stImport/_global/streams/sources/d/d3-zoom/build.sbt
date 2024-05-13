organization := "org.scalablytyped"
name := "d3-zoom"
version := "3.0.8-e9b983"
scalaVersion := "3.2.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scala-js" %%% "scalajs-dom" % "2.3.0",
  "org.scalablytyped" %%% "d3-color" % "3.1.3-159401",
  "org.scalablytyped" %%% "d3-interpolate" % "3.0.4-6a17b3",
  "org.scalablytyped" %%% "d3-selection" % "3.0.10-6b49a4",
  "org.scalablytyped" %%% "std" % "5.4-ba3953")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
