package vscAi

import com.raquo.laminar.api.L.{*, given}
import scala.scalajs.js
import scala.scalajs.js.annotation.*
import org.scalajs.dom
import scala.scalajs.js.timers._
import model._
import typings.d3.global.d3
import typings.std.stdStrings.text
import scala.compiletime.ops.boolean

// import javascriptLogo from "/javascript.svg"
@js.native @JSImport("/javascript.svg", JSImport.Default)
val javascriptLogo: String = js.native

/* var weightList = Var(List[String]())
var outputList = Var(List[String]())
var nodeList:List[String] = List()
var nodeCount = 0 */


var weights = List(Var("w1"),Var("w2"),Var("w3"))
var inputs = List(Var("x1"),Var("x2"),Var("x3"))
var output = Var("o")
var outputsAll = List(Var("0"),Var("1"),Var("2"),Var("3"),Var("4"))
var bias = Var("b")

var rightAmount = Var(0)
var rightCycles = Var(0)

var networkOutput = Var("OUTPUT")

var weight = Var("")
var lenght = Var("")
var nodeCount = 0

var nodeList = List[String]()

var singular = true
var modeRendering = Var(nodeSingular("4"))
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
        trainButton(),
        recreateButton(),
        testButton(),
        trainFinishButton(),
      ),
      nodeShow()
    )
    
  end appElement
end Main

def modeButton(): Element =
  button(
    tpe := "button",
    "Change mode",
    onClick --> { event => {
      if (singular) {
        modeRendering.set(nodeSingular("2"))
      } else {
        modeRendering.set(nodeSingular("4"))
      }
      singular = !singular
    }},
  )
def inputFields(): Element = 
  div(
    paddingTop := "22%",
    p(
    label("Length: "),
    input(
      placeholder("123"),
      maxLength(3), // HTML can help block some undesired input
      controlled(
        value <-- lenght,
        onInput.mapToValue.filter(_.forall(Character.isDigit)) --> lenght
      )
    )
  ),
  p(
    label("Weight: "),
    input(
      placeholder("123"),
      maxLength(3), // HTML can help block some undesired input
      controlled(
        value <-- weight,
        onInput.mapToValue.filter(_.forall(Character.isDigit)) --> weight
      )
    )
  ),runButton(),
  )
end inputFields

def recreateButton(): Element =
  val counter = Var(0)
  button(
    tpe := "button",
    "recreate",
    onClick --> { event => {
      createNetwork
    }},
  )
end recreateButton

def trainButton(): Element =
  button(
    tpe := "button",
    "train",
    onClick --> { event => {
      println("train")
      for i <- Range(0,5) yield {
        println("step" + i)
        trainAi
        println(ai.layerSizes)
        var weightsSeq = ai.getWeights("10")

        weights(0).set(weightsSeq(0))
        weights(1).set(weightsSeq(1))
        weights(2).set(weightsSeq(2))
        bias.set(ai.getBias("10"))
        setTimeout(10000)
      }
    }},
  )
end trainButton

def trainFinishButton(): Element =
  button(
    tpe := "button",
    "train 'till done",
    onClick --> { event => {
      println("train")
      var currentCount = 0
      while(currentCount < 5) {
        println("step" + i)
        trainAi
        rightCycles.update(c => c + 10)

        currentCount = testCountReturn()
        var weightsSeq = ai.getWeights("10")

        weights(0).set(weightsSeq(0))
        weights(1).set(weightsSeq(1))
        weights(2).set(weightsSeq(2))
        bias.set(ai.getBias("10"))
        println(rightCycles.now())
        println(currentCount)
      }
    }
    },
  )
end trainFinishButton

def runButton(): Element =
  button(
    tpe := "button",
    "run",
    onClick --> { event => {
      var ret = testAiReturn(lenght.now(), weight.now())
      
      inputs(0).set(ai.getOutput("00"))
      inputs(1).set(ai.getOutput("01"))
      inputs(2).set(ai.getOutput("02"))
      output.set(ai.getOutput("10"))

      for i <- 0 until nodeCount yield
        outputsAll(i).set(ai.getOutput(nodeList(i)))
      
      networkOutput.set(ret)
      /* outputList.set(List())
      for i <- 0 until nodeCount yield
        outputList.update(_ :+ ai.getOutputs(nodeList(i))) */
    }},
  )
end runButton

def testButton(): Element =
  button(
    tpe := "button",
    "test",
    onClick --> { event => {
      test()
      inputs(0).set(ai.getOutput("00"))
      inputs(1).set(ai.getOutput("01"))
      inputs(2).set(ai.getOutput("02"))
      output.set(ai.getOutput("10"))

      for i <- 0 until nodeCount yield
        println(nodeList(i))
        outputsAll(i).set(ai.getOutput(nodeList(i)))
    }},
  )
end testButton


def layer(no:Int,n:Int): Element = 
  val divs = div(className := "layer",
    display.flex, // same as `display := "none"`
    flexDirection.column, // same as `flexDirection := "column"`
    justifyContent.center,
    for i <- Range(0,n) yield {
      nodeCount +=1
      nodeList = nodeList :+ "" + no.toString+i.toString 
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

def plusSvg(x:String, y:String): Element =
 svg.svg(
      svg.x :=x,
      svg.y:=y,
      svg.height := "25",
      svg.width := "25",
      svg.rect(
        svg.height := "20",
        svg.width := "20",
        svg.fill:="white",
      ),
      svg.line(
        svg.x1 := "3",
        svg.y1 := "10",
        svg.x2 := "17",
        svg.y2 := "10",
        svg.fill:="black",
        svg.stroke:="black"
      ),
      svg.line(
        svg.x1 := "10",
        svg.y1 := "3",
        svg.x2 := "10",
        svg.y2 := "17",
        svg.fill:="black",
        svg.stroke:="black"
      ),
      )

def mulSvg(x:String, y:String): Element =
  svg.svg(
      svg.x :=x,
      svg.y:=y,
      svg.height := "25",
      svg.width := "25",
      svg.circle(
        svg.r:="10",
        svg.cx:="12",
        svg.cy:="12",
        svg.fill:="white",
      ),
      svg.line(
        svg.x1 := "5",
        svg.y1 := "5",
        svg.x2 := "20",
        svg.y2 := "20",
        svg.fill:="black",
        svg.stroke:="black"
      ),
      svg.line(
        svg.x1 := "5",
        svg.y1 := "20",
        svg.x2 := "20",
        svg.y2 := "5",
        svg.fill:="black",
        svg.stroke:="black"
      ),
      )

def nodeShow(): Element =
  div(
    child <-- modeRendering
  )
  

def nodeSingular(nodeId:String): Element = 
  div(
    display.flex, // same as `display := "none"`
    flexDirection.row, // same as `flexDirection := "column"`
    justifyContent.center,
    className:=nodeId,
    inputFields(),
    layer(0,3),
    div(
      svg.svg(
        svg.height := "250",
        svg.width := "270",
        svg.circle(
          svg.r:="95",
          svg.cx:="135",
          svg.cy:="125",
          svg.fill:="red",
          onClick --> {event => println(nodeId) },
        ),
          svg.svg(
            plusSvg("52%","44%"),
            mulSvg(
              "20%",
              "27%"
            ),
            mulSvg(
              "20%",
              "43%"
            ),
            mulSvg(
              "20%",
              "59%"
            ),
            //inputs
            svg.text(
              child.text <-- inputs(0),
              svg.x := "5%",
              svg.y:="35%",
              svg.textAnchor := "middle",
              svg.fill:="white"
            ),
            svg.text(
              child.text <-- inputs(1),
              svg.x := "5%",
              svg.y:="50%",
              svg.textAnchor := "middle",
              svg.fill:="white"
            ),
            svg.text(
              child.text <-- inputs(2),
              svg.x := "5%",
              svg.y:="65%",
              svg.textAnchor := "middle",
              svg.fill:="white"
            ),

            //weights

            svg.text(
              child.text <-- weights(0),
              svg.x := "40%",
              svg.y:="35%",
              svg.textAnchor := "middle",
              svg.fill:="white"
            ),
            svg.text(
              child.text <-- weights(1),
              svg.x := "40%",
              svg.y:="50%",
              svg.textAnchor := "middle",
              svg.fill:="white"
            ),
            svg.text(
              child.text <-- weights(2),
              svg.x := "40%",
              svg.y:="65%",
              svg.textAnchor := "middle",
              svg.fill:="white"
            ),
            
            //output and bias
            
            svg.text(
              child.text <-- output,
              svg.x := "70%",
              svg.y:="50%",
              svg.textAnchor := "middle",
              svg.fill:="white"
            ), svg.text(
              child.text <-- bias,
              svg.x := "55%",
              svg.y:="65%",
              svg.textAnchor := "middle",
              svg.fill:="white"
            ),
          )
      ),
      layer(1,1)
    ),layer(2,1),
      svg.svg(
        svg.text(
          child.text <-- networkOutput,
          svg.x := "50%",
          svg.y:="50%",
          svg.textAnchor := "middle",
          svg.fill:="white"
        ))
      
  )
  
def node(nodeId:String, nodeCount:Int): Element =

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
        onClick --> {event => println(nodeId) },
      ),
      if ((nodeCount > 1 && nodeCount < 5) || nodeCount == 7) {
      svg.svg(
      svg.text(
        svg.x := "40%",
        svg.y:="40%",
        svg.textAnchor := "middle",
        svg.fill:="white"
      ),
      svg.text(
        svg.x := "40%",
        svg.y:="60%",
        svg.textAnchor := "middle",
        svg.fill:="white"
      ))} else if (nodeCount > 4 && nodeCount < 7) {
        svg.svg(
          svg.text(
            child.text <-- outputsAll(nodeCount),
            svg.x := "40%",
            svg.y:="35%",
            svg.textAnchor := "middle",
            svg.fill:="white"
          ),
          svg.text(
            child.text <-- outputsAll(nodeCount),
            svg.x := "40%",
            svg.y:="50%",
            svg.textAnchor := "middle",
            svg.fill:="white"
          ),
          svg.text(
            child.text <-- outputsAll(nodeCount),
            svg.x := "40%",
            svg.y:="65%",
            svg.textAnchor := "middle",
            svg.fill:="white"
          )
          )
      }
      else emptyNode,
      svg.text(
        child.text <-- outputsAll(nodeCount),
        svg.x := "80%",
        svg.y:="50%",
        svg.textAnchor := "middle",
        svg.fill:="white"
      ),
        
    )
  )
end node 
