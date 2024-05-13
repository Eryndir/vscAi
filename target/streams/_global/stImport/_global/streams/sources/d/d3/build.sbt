organization := "org.scalablytyped"
name := "d3"
version := "7.4.3-28b66c"
scalaVersion := "3.2.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scala-js" %%% "scalajs-dom" % "2.3.0",
  "org.scalablytyped" %%% "d3-array" % "3.2.1-45a8b3",
  "org.scalablytyped" %%% "d3-axis" % "3.0.6-9b0c79",
  "org.scalablytyped" %%% "d3-brush" % "3.0.6-ad4503",
  "org.scalablytyped" %%% "d3-chord" % "3.0.6-40ce73",
  "org.scalablytyped" %%% "d3-color" % "3.1.3-159401",
  "org.scalablytyped" %%% "d3-contour" % "3.0.6-688c34",
  "org.scalablytyped" %%% "d3-delaunay" % "6.0.4-92fc1a",
  "org.scalablytyped" %%% "d3-dispatch" % "3.0.6-8f84d1",
  "org.scalablytyped" %%% "d3-drag" % "3.0.7-5496a0",
  "org.scalablytyped" %%% "d3-dsv" % "3.0.7-c3b0ce",
  "org.scalablytyped" %%% "d3-ease" % "3.0.2-e52cb8",
  "org.scalablytyped" %%% "d3-fetch" % "3.0.7-f2d48a",
  "org.scalablytyped" %%% "d3-force" % "3.0.9-cdcdbc",
  "org.scalablytyped" %%% "d3-format" % "3.0.4-10adbf",
  "org.scalablytyped" %%% "d3-geo" % "3.1.0-8aabb7",
  "org.scalablytyped" %%% "d3-hierarchy" % "3.1.7-507bff",
  "org.scalablytyped" %%% "d3-interpolate" % "3.0.4-6a17b3",
  "org.scalablytyped" %%% "d3-path" % "3.1.0-13f581",
  "org.scalablytyped" %%% "d3-quadtree" % "3.0.6-71099a",
  "org.scalablytyped" %%% "d3-random" % "3.0.3-fec72f",
  "org.scalablytyped" %%% "d3-scale" % "4.0.8-d62e0d",
  "org.scalablytyped" %%% "d3-selection" % "3.0.10-6b49a4",
  "org.scalablytyped" %%% "d3-shape" % "3.1.6-29be5c",
  "org.scalablytyped" %%% "d3-time" % "3.0.3-09657d",
  "org.scalablytyped" %%% "d3-time-format" % "4.0.3-46bf4e",
  "org.scalablytyped" %%% "d3-timer" % "3.0.2-cc12e2",
  "org.scalablytyped" %%% "d3-transition" % "3.0.8-d6498a",
  "org.scalablytyped" %%% "d3-zoom" % "3.0.8-e9b983",
  "org.scalablytyped" %%% "geojson" % "7946.0.14-f9789d",
  "org.scalablytyped" %%% "std" % "5.4-ba3953")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
