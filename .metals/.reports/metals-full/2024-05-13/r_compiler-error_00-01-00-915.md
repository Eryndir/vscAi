file://<WORKSPACE>/src/main/scala/vscAi/VscAi.scala
### file%3A%2F%2F%2Fhome%2Feryndir%2Fcode%2FvscAi%2Fsrc%2Fmain%2Fscala%2FvscAi%2FVscAi.scala:11: error: expected start of definition
val javascriptLogo: String = js.native
^

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.12.17
Classpath:
<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.12.17/scala-library-2.12.17.jar [exists ]
Options:



action parameters:
uri: file://<WORKSPACE>/src/main/scala/vscAi/VscAi.scala
text:
```scala
package vscAi

import com.raquo.laminar.api.L.{*, given}
import scala.scalajs.js
import scala.scalajs.js.annotation.*
import org.scalajs.dom
import model._

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
        startButton(),
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

def startButton(): Element =
  val counter = Var(0)
  button(
    tpe := "button",
    "start",
    onClick --> { event => getCoord(".n10")},
  )
end startButton

def layer(no:Int,n:Int): Element = 
  div(className := "layer",
    display.flex, // same as `display := "none"`
    flexDirection.column, // same as `flexDirection := "column"`
    justifyContent.center,
    for i <- Range(0,n) yield
      node("n" + no.toString+i.toString)
  )
end layer

def getCoord(id:String): Unit =
  val tmp: dom.Element = dom.document.querySelector(".n10")
  tmp.unmount()
end getCoord

def node(nodeId:String): Element =
  div(
    className:=nodeId,
    svg.svg(
      svg.height := "150",
      svg.width := "150",
      svg.circle(
        svg.r:="45",
        svg.cx:="50",
        svg.cy:="50",
        svg.fill:="red",
        onClick --> {event => println(nodeId)},
      )
    )
  )
end node

```



#### Error stacktrace:

```
scala.meta.internal.parsers.Reporter.syntaxError(Reporter.scala:16)
	scala.meta.internal.parsers.Reporter.syntaxError$(Reporter.scala:16)
	scala.meta.internal.parsers.Reporter$$anon$1.syntaxError(Reporter.scala:22)
	scala.meta.internal.parsers.Reporter.syntaxError(Reporter.scala:17)
	scala.meta.internal.parsers.Reporter.syntaxError$(Reporter.scala:17)
	scala.meta.internal.parsers.Reporter$$anon$1.syntaxError(Reporter.scala:22)
	scala.meta.internal.parsers.ScalametaParser.tmplDef(ScalametaParser.scala:3983)
	scala.meta.internal.parsers.ScalametaParser.topLevelTmplDef(ScalametaParser.scala:3956)
	scala.meta.internal.parsers.ScalametaParser$$anonfun$2.applyOrElse(ScalametaParser.scala:4558)
	scala.meta.internal.parsers.ScalametaParser$$anonfun$2.applyOrElse(ScalametaParser.scala:4546)
	scala.PartialFunction.$anonfun$runWith$1$adapted(PartialFunction.scala:145)
	scala.meta.internal.parsers.ScalametaParser.statSeqBuf(ScalametaParser.scala:4537)
	scala.meta.internal.parsers.ScalametaParser.bracelessPackageStats$1(ScalametaParser.scala:4756)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$batchSource$11(ScalametaParser.scala:4767)
	scala.meta.internal.parsers.ScalametaParser.autoEndPos(ScalametaParser.scala:368)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$batchSource$10(ScalametaParser.scala:4767)
	scala.meta.internal.parsers.ScalametaParser.tryParse(ScalametaParser.scala:216)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$batchSource$1(ScalametaParser.scala:4759)
	scala.meta.internal.parsers.ScalametaParser.atPos(ScalametaParser.scala:316)
	scala.meta.internal.parsers.ScalametaParser.autoPos(ScalametaParser.scala:365)
	scala.meta.internal.parsers.ScalametaParser.batchSource(ScalametaParser.scala:4727)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$source$1(ScalametaParser.scala:4720)
	scala.meta.internal.parsers.ScalametaParser.atPos(ScalametaParser.scala:316)
	scala.meta.internal.parsers.ScalametaParser.autoPos(ScalametaParser.scala:365)
	scala.meta.internal.parsers.ScalametaParser.source(ScalametaParser.scala:4720)
	scala.meta.internal.parsers.ScalametaParser.entrypointSource(ScalametaParser.scala:4725)
	scala.meta.internal.parsers.ScalametaParser.parseSourceImpl(ScalametaParser.scala:135)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$parseSource$1(ScalametaParser.scala:132)
	scala.meta.internal.parsers.ScalametaParser.parseRuleAfterBOF(ScalametaParser.scala:59)
	scala.meta.internal.parsers.ScalametaParser.parseRule(ScalametaParser.scala:54)
	scala.meta.internal.parsers.ScalametaParser.parseSource(ScalametaParser.scala:132)
	scala.meta.parsers.Parse$.$anonfun$parseSource$1(Parse.scala:29)
	scala.meta.parsers.Parse$$anon$1.apply(Parse.scala:36)
	scala.meta.parsers.Api$XtensionParseDialectInput.parse(Api.scala:25)
	scala.meta.internal.semanticdb.scalac.ParseOps$XtensionCompilationUnitSource.toSource(ParseOps.scala:17)
	scala.meta.internal.semanticdb.scalac.TextDocumentOps$XtensionCompilationUnitDocument.toTextDocument(TextDocumentOps.scala:206)
	scala.meta.internal.pc.SemanticdbTextDocumentProvider.textDocument(SemanticdbTextDocumentProvider.scala:54)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$semanticdbTextDocument$1(ScalaPresentationCompiler.scala:400)
```
#### Short summary: 

file%3A%2F%2F%2Fhome%2Feryndir%2Fcode%2FvscAi%2Fsrc%2Fmain%2Fscala%2FvscAi%2FVscAi.scala:11: error: expected start of definition
val javascriptLogo: String = js.native
^