organization := "org.scalablytyped"
name := "d3-geo"
version := "3.1.0-8aabb7"
scalaVersion := "3.2.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scala-js" %%% "scalajs-dom" % "2.3.0",
  "org.scalablytyped" %%% "geojson" % "7946.0.14-f9789d",
  "org.scalablytyped" %%% "std" % "5.4-ba3953")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
