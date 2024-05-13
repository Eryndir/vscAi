file://<WORKSPACE>/src/main/scala/vscAi/VscAi.scala
### java.lang.AssertionError: NoDenotation.owner

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.2.2
Classpath:
<WORKSPACE>/.bloop/vscAi/bloop-bsp-clients-classes/classes-Metals-joxEksUjTJa-XiBQQM1lZA== [exists ], <HOME>/.cache/bloop/semanticdb/com.sourcegraph.semanticdb-javac.0.9.9/semanticdb-javac-0.9.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_sjs1_3/3.2.2/scala3-library_sjs1_3-3.2.2.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-js/scalajs-library_2.13/1.16.0/scalajs-library_2.13-1.16.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-js/scalajs-dom_sjs1_3/2.4.0/scalajs-dom_sjs1_3-2.4.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/raquo/laminar_sjs1_3/15.0.1/laminar_sjs1_3-15.0.1.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-format_sjs1_3/3.0.4-10adbf/jars/d3-format_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-dispatch_sjs1_3/3.0.6-8f84d1/jars/d3-dispatch_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-timer_sjs1_3/3.0.2-cc12e2/jars/d3-timer_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/std_sjs1_3/5.4-ba3953/jars/std_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-path_sjs1_3/3.1.0-13f581/jars/d3-path_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-color_sjs1_3/3.1.3-159401/jars/d3-color_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-interpolate_sjs1_3/3.0.4-6a17b3/jars/d3-interpolate_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/geojson_sjs1_3/7946.0.14-f9789d/jars/geojson_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-random_sjs1_3/3.0.3-fec72f/jars/d3-random_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-selection_sjs1_3/3.0.10-6b49a4/jars/d3-selection_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-dsv_sjs1_3/3.0.7-c3b0ce/jars/d3-dsv_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3_sjs1_3/7.4.3-28b66c/jars/d3_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-scale_sjs1_3/4.0.8-d62e0d/jars/d3-scale_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-delaunay_sjs1_3/6.0.4-92fc1a/jars/d3-delaunay_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-ease_sjs1_3/3.0.2-e52cb8/jars/d3-ease_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-drag_sjs1_3/3.0.7-5496a0/jars/d3-drag_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-force_sjs1_3/3.0.9-cdcdbc/jars/d3-force_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-chord_sjs1_3/3.0.6-40ce73/jars/d3-chord_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-axis_sjs1_3/3.0.6-9b0c79/jars/d3-axis_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-brush_sjs1_3/3.0.6-ad4503/jars/d3-brush_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-quadtree_sjs1_3/3.0.6-71099a/jars/d3-quadtree_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-hierarchy_sjs1_3/3.1.7-507bff/jars/d3-hierarchy_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-zoom_sjs1_3/3.0.8-e9b983/jars/d3-zoom_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-fetch_sjs1_3/3.0.7-f2d48a/jars/d3-fetch_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-time_sjs1_3/3.0.3-09657d/jars/d3-time_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-time-format_sjs1_3/4.0.3-46bf4e/jars/d3-time-format_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-shape_sjs1_3/3.1.6-29be5c/jars/d3-shape_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-transition_sjs1_3/3.0.8-d6498a/jars/d3-transition_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-array_sjs1_3/3.2.1-45a8b3/jars/d3-array_sjs1_3.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/olvind/scalablytyped-runtime_sjs1_3/2.4.2/scalablytyped-runtime_sjs1_3-2.4.2.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-geo_sjs1_3/3.1.0-8aabb7/jars/d3-geo_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-contour_sjs1_3/3.0.6-688c34/jars/d3-contour_sjs1_3.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.13/scala-library-2.13.13.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-js/scalajs-javalib/1.16.0/scalajs-javalib-1.16.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-js/scalajs-scalalib_2.13/2.13.13%2B1.16.0/scalajs-scalalib_2.13-2.13.13%2B1.16.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/raquo/airstream_sjs1_3/15.0.0/airstream_sjs1_3-15.0.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/raquo/ew_sjs1_3/0.1.2/ew_sjs1_3-0.1.2.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/app/tulz/tuplez-full-light_sjs1_3/0.4.0/tuplez-full-light_sjs1_3-0.4.0.jar [exists ]
Options:
-scalajs -Xsemanticdb -sourceroot <WORKSPACE>


action parameters:
offset: 2064
uri: file://<WORKSPACE>/src/main/scala/vscAi/VscAi.scala
text:
```scala
package vscAi

import com.raquo.laminar.api.L.{*, given}
import scala.scalajs.js
import scala.scalajs.js.annotation.*
import org.scalajs.dom
import model._
import typings.d3.global.d3
import typings.std.stdStrings.text

// import javascriptLogo from "/javascript.svg"
@js.native @JSImport("/javascript.svg", JSImport.Default)
val javascriptLogo: String = js.native

@main
def LiveChart(): Unit =
  renderOnDomContentLoaded(
    dom.document.getElementById("app"),
    Main.appElement()
  )

object Main:
  def appElement(): Element =
    div(
      div(className := "card",
        runButton(),
        dataButton(),
      ),
      div(
        display.flex, // same as `display := "none"`
        flexDirection.row, // same as `flexDirection := "column"`
        justifyContent.center,
        layer(0,2),
        layer(1,3),
        layer(2,2),
        layer(3,1)
      )
    )
    
  end appElement
end Main

def counterButton(): Element =
  val counter = Var(0)
  button(
    tpe := "button",
    "count is ",
    child.text <-- counter,
    onClick --> { event => counter.update(c => c + 1) },
  )
end counterButton

def dataButton(): Element =
  val counter = Var(0)
  button(
    tpe := "button",
    "data",
    onClick --> { event => genNetwork()},
  )
end dataButton

def runButton(): Element =
  val counter = Var(0)
  button(
    tpe := "button",
    "run",
    onClick --> { event => runAi},
  )
end runButton

def layer(no:Int,n:Int): Element = 
  div(className := "layer",
    display.flex, // same as `display := "none"`
    flexDirection.column, // same as `flexDirection := "column"`
    justifyContent.center,
    for i <- Range(0,n) yield
      node("n" + no.toString+i.toString)
  )
end layer

def genNetwork(): Unit =
  val tmp = ai.getData
  println(tmp._1)
end genNetwork

def getCoord(id:String): (Double, Double) =
  val tmp: dom.Element = dom.document.querySelector("."+id)
  val rect = tmp.getBoundingClientRect()
  return (rect.x,rect.y)
end getCoord

def node(nodeId:String): Element =
  var bias = Var("tmp")
  var weights = Var(Vec[@@])

  div(
    className:=nodeId,
    svg.svg(
      svg.height := "150",
      svg.width := "150",
      svg.circle(
        svg.r:="45",
        svg.cx:="75",
        svg.cy:="75",
        svg.fill:="red",
        onClick --> {event => weights.update(c => ai.getWeights(nodeId)) },
      ),
      svg.text(
        child.text <-- bias,
        svg.x := "50%",
        svg.y:="50%",
        svg.textAnchor := "middle",
        svg.fill:="white"
      )
    )
  )
end node

```



#### Error stacktrace:

```
dotty.tools.dotc.core.SymDenotations$NoDenotation$.owner(SymDenotations.scala:2511)
	scala.meta.internal.pc.SignatureHelpProvider$.isValid(SignatureHelpProvider.scala:83)
	scala.meta.internal.pc.SignatureHelpProvider$.notCurrentApply(SignatureHelpProvider.scala:96)
	scala.meta.internal.pc.SignatureHelpProvider$.$anonfun$1(SignatureHelpProvider.scala:48)
	scala.collection.StrictOptimizedLinearSeqOps.loop$3(LinearSeq.scala:280)
	scala.collection.StrictOptimizedLinearSeqOps.dropWhile(LinearSeq.scala:282)
	scala.collection.StrictOptimizedLinearSeqOps.dropWhile$(LinearSeq.scala:278)
	scala.collection.immutable.List.dropWhile(List.scala:79)
	scala.meta.internal.pc.SignatureHelpProvider$.signatureHelp(SignatureHelpProvider.scala:48)
	scala.meta.internal.pc.ScalaPresentationCompiler.signatureHelp$$anonfun$1(ScalaPresentationCompiler.scala:414)
```
#### Short summary: 

java.lang.AssertionError: NoDenotation.owner