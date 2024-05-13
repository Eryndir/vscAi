package vscAi

import com.raquo.laminar.api.L.{*, given}
import scala.scalajs.js
import scala.scalajs.js.annotation.*
import org.scalajs.dom
import model._
import typings.d3.global.d3
import typings.std.stdStrings.text
import scala.compiletime.ops.boolean

// import javascriptLogo from "/javascript.svg"
@js.native @JSImport("/javascript.svg", JSImport.Default)
val javascriptLogo: String = js.native

var weightList = Var(List[String]())
var nodeList:List[String] = List()
var nodeCount = 0

@main
def LiveChart(): Unit =
  renderOnDomContentLoaded(
    dom.document.getElementById("app"),
    Main.appElement()
  )

object Main:
  def appElement(): Element =
    var clicker = Var(false)
    div(
      div(className := "card",
        runButton(),
        trainButton(),
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

def dataButton(): Element =
  val counter = Var(0)
  button(
    tpe := "button",
    "recreate",
    onClick --> { event => {
      createNetwork
      weightList.set(List())
      for i <- 0 until nodeCount yield
        weightList.update(_ :+ ai.getWeights(nodeList(i)))
    }},
  )
end dataButton

def trainButton(): Element =
  button(
    tpe := "button",
    "train",
    onClick --> { event => {
      println("train")
      trainAi
      weightList.set(List())
      for i <- 0 until nodeCount yield
        weightList.update(_ :+ ai.getWeights(nodeList(i)))
    }},
  )
end trainButton

def runButton(): Element =
  button(
    tpe := "button",
    "run",
    onClick --> { event => {
      testAi
    }},
  )
end runButton

def layer(no:Int,n:Int): Element = 
  val divs = div(className := "layer",
    display.flex, // same as `display := "none"`
    flexDirection.column, // same as `flexDirection := "column"`
    justifyContent.center,
    for i <- Range(0,n) yield {
      nodeCount +=1
      nodeList = nodeList :+ "n" + no.toString+i.toString
      node("n" + no.toString+i.toString, nodeCount-1)
    }
  )

  return divs
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

def node(nodeId:String, nodeCount:Int): Element =
  var weights = Var("")

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
        onClick --> {event => println("wow") },
      ),
      svg.text(
        child.text <-- weightList.signal.map(c => c(nodeCount)),
        svg.x := "50%",
        svg.y:="10%",
        svg.textAnchor := "middle",
        svg.fill:="white"
      )
    )
  )
end node
