package vscAi

import com.raquo.laminar.api.L.{*, given}
import scala.scalajs.js
import scala.scalajs.js.annotation.*
import org.scalajs.dom
import scala.scalajs.js.timers._
import model._
import scala.compiletime.ops.boolean


var weights = List(
  (Var("w000"),Var("w001"),Var("-1")),
  (Var("w010"),Var("w011"),Var("-1")),
  (Var("w020"),Var("w021"),Var("-1")),
  (Var("w110"),Var("w111"),Var("w102")),
  (Var("w200"),Var("w201"),Var("-1")),
  (Var("w100"),Var("w101"),Var("w102"))
  )


//var inputs = List(Var("x1"),Var("x2"),Var("x3"))
var inputs = List(
  (Var("x000"),Var("x001"),Var("-1")),
  (Var("x010"),Var("x011"),Var("-1")),
  (Var("x020"),Var("x021"),Var("-1")),
  (Var("x110"),Var("x111"),Var("x102")),
  (Var("x200"),Var("x201"),Var("-1")),
  (Var("x100"),Var("x101"),Var("x102"))
  )

var outputs = List(Var("0"),Var("1"),Var("2"),Var("3"),Var("4"),Var("5"))
var bias = Var("b")

var rightCycles = Var(0)

var networkOutput = Var("OUTPUT")

var weight = Var("")
var lenght = Var("")
var nodeCount = 0

var nodeList = List[String]("00","01","02","10", "20","11")

var trainDataSignal = Var("")
var testDataSignal = Var("")

var message = Var("Welcome to the neural network!")

var singular = true
var modeRendering = Var(nodeSingular("5"))
@main
def LiveChart(): Unit =
  renderOnDomContentLoaded(
    dom.document.getElementById("app"),
    Main.appElement()
  )

object Main:
  def appElement(): Element =
    var clicker = Var(false)

    trainDataSignal.set(trainDataString)
    testDataSignal.set(testDataString)

    div(
      backgroundColor := "#242424",
      div(className := "card",
        trainButton(),
        testButton(),
        trainFinishButton(),
        resetButton(),
      ),
      messageField(),
      nodeShow(),
      datasetFields()
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

def messageField(): Element =
  div(
    p(
      child.text <-- message
    )
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

def datasetFields(): Element =
  div(
      display.flex, // same as `display := "none"`
      flexDirection.row, // same as `flexDirection := "column"`
      justifyContent.center,
    div(
      p(
        label("Train Data")
      ),
      textArea(
        rows :=10,
        controlled(
          value <-- trainDataSignal,
          onInput.mapToValue  --> trainDataSignal
                  )
              )
        ),
    div(
    p(
      label("Test Data")
    ),
    textArea(
      rows :=10,
      controlled(
        value <-- testDataSignal,
        onInput
        .mapToValue
        --> testDataSignal
                )       
            )
      )
   )

def resetButton(): Element =
  button(
    tpe := "button",
    "reset",
    onClick --> { event => {
      resetNetwork()
      createNetwork
    }},
  )
end resetButton

def resetNetwork(): Unit =
    updateWeights(true)
    updateInputs(true)
    updateOutputs(true)
    bias.set("b")
end resetNetwork

def trainButton(): Element =
  button(
    tpe := "button",
    "train",
    onClick --> { event => {
      println("train")
      for i <- Range(0,5) yield {
        println("step" + i)
        trainAi(DataSet.fromLines(trainDataSignal.now()))
        println(ai.layerSizes)

        updateWeights()

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
      rightCycles.set(0)
      
      var goalCount = DataSet.dataRows(testDataSignal.now())
      while(currentCount < goalCount) {
        println("step" + i)
        trainAi(DataSet.fromLines(trainDataSignal.now()))
        rightCycles.update(c => c + 10)

        currentCount = testCountReturn(DataSet.fromLines(testDataSignal.now()))

        updateWeights()

        bias.set(ai.getBias("10"))
        println(rightCycles.now())
        println(currentCount)
        message.set(f"It took ${rightCycles.now()} training cycles to get $goalCount right")
      }
    }
    },
  )
end trainFinishButton

def updateOutputs(reset:Boolean = false): Unit = {

  for i <- 0 until nodeCount+1 yield
        println(nodeList(i))
        if reset then outputs(i).set(i.toString)
        else outputs(i).set(ai.getOutput(nodeList(i)))
}

def updateInputs(reset:Boolean = false): Unit = {
  if(reset == true) {
    inputs(0)(0).set("x000")
    inputs(0)(1).set("x001")
    inputs(1)(0).set("x010")
    inputs(1)(1).set("x011")
    inputs(2)(0).set("x020")
    inputs(2)(1).set("x021")
    inputs(5)(0).set("x100")
    inputs(5)(1).set("x101")
    inputs(5)(2).set("x102")
    inputs(3)(0).set("x110")
    inputs(3)(1).set("x111")
    inputs(3)(2).set("x112")
    inputs(4)(0).set("x200")
    inputs(4)(1).set("x201")

  } else {
    inputs(0)(0).set(ai.input(0).toString())
    inputs(0)(1).set(ai.input(1).toString())

    inputs(1)(0).set(ai.input(0).toString())
    inputs(1)(1).set(ai.input(1).toString())

    inputs(2)(0).set(ai.input(0).toString())
    inputs(2)(1).set(ai.input(1).toString())

    inputs(5)(0).set(ai.getOutput("00"))
    inputs(5)(1).set(ai.getOutput("01"))
    inputs(5)(2).set(ai.getOutput("02"))

    inputs(3)(0).set(ai.getOutput("00"))
    inputs(3)(1).set(ai.getOutput("01"))
    inputs(3)(2).set(ai.getOutput("02"))

    inputs(4)(0).set(ai.getOutput("11"))
    inputs(4)(1).set(ai.getOutput("10"))
  }
}

def updateWeights(reset:Boolean = false): Unit = {
  if(reset == true) {
    weights(0)(0).set("w000")
    weights(0)(1).set("w001")
    weights(1)(0).set("w010")
    weights(1)(1).set("w011")
    weights(2)(0).set("w020")
    weights(2)(1).set("w021")
    weights(5)(0).set("w100")
    weights(5)(1).set("w101")
    weights(5)(2).set("w102")
    weights(3)(0).set("w110")
    weights(3)(1).set("w111")
    weights(3)(2).set("w112")
    weights(4)(0).set("w200")
    weights(4)(1).set("w201")

  } else {
    weights(0)(0).set(ai.getWeights("00")(0))
    weights(0)(1).set(ai.getWeights("00")(1))

    weights(1)(0).set(ai.getWeights("01")(0))
    weights(1)(1).set(ai.getWeights("01")(1))

    weights(2)(0).set(ai.getWeights("02")(0))
    weights(2)(1).set(ai.getWeights("02")(1))

    weights(5)(0).set(ai.getWeights("10")(0))
    weights(5)(1).set(ai.getWeights("10")(1))
    weights(5)(2).set(ai.getWeights("10")(1))

    weights(3)(0).set(ai.getWeights("11")(0))
    weights(3)(1).set(ai.getWeights("11")(1))
    weights(3)(2).set(ai.getWeights("11")(2))

    weights(4)(0).set(ai.getWeights("20")(0))
    weights(4)(1).set(ai.getWeights("20")(1))
  }
}


def runButton(): Element =
  button(
    tpe := "button",
    "run",
    onClick --> { event => {
      var ret = testAiReturn(lenght.now(), weight.now())
      
      updateInputs()
    

      updateOutputs()
      
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
      val total =  DataSet.dataRows(testDataSignal.now())
      val correct = testCountReturn(DataSet.fromLines(testDataSignal.now()))

      updateInputs()
      message.set(f"$correct/$total correct")
      updateOutputs()
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
      node("n" + no.toString+i.toString, nodeCount-1)
    }
    
  ) 
  return divs
end layer


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
            plusSvg("62%","44%"),
            mulSvg(
              "30%",
              "27%"
            ),
            mulSvg(
              "30%",
              "43%"
            ),
            mulSvg(
              "30%",
              "59%"
            ),
            //inputs
            svg.text(
              child.text <-- inputs(5)(0),
              svg.x := "15%",
              svg.y:="35%",
              svg.textAnchor := "middle",
              svg.fill:="white"
            ),
            svg.text(
              child.text <-- inputs(5)(1),
              svg.x := "15%",
              svg.y:="50%",
              svg.textAnchor := "middle",
              svg.fill:="white"
            ),
            svg.text(
              child.text <-- inputs(5)(2),
              svg.x := "15%",
              svg.y:="65%",
              svg.textAnchor := "middle",
              svg.fill:="white"
            ),

            //weights

            svg.text(
              child.text <-- weights(5)(0),
              svg.x := "50%",
              svg.y:="35%",
              svg.textAnchor := "middle",
              svg.fill:="white"
            ),
            svg.text(
              child.text <-- weights(5)(1),
              svg.x := "50%",
              svg.y:="50%",
              svg.textAnchor := "middle",
              svg.fill:="white"
            ),
            svg.text(
              child.text <-- weights(5)(2),
              svg.x := "50%",
              svg.y:="65%",
              svg.textAnchor := "middle",
              svg.fill:="white"
            ),
            
            //output and bias
            
            svg.text(
              child.text <-- outputs(5),
              svg.x := "80%",
              svg.y:="50%",
              svg.textAnchor := "middle",
              svg.fill:="white"
            ), svg.text(
              child.text <-- bias,
              svg.x := "65%",
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
      svg.fontSize := "smaller",
      svg.height := "175",
      svg.width := "175",
      svg.circle(
        svg.r:="50",
        svg.cx:="80",
        svg.cy:="80",
        svg.fill:="red",
        onClick --> {event => println(f"$nodeId, $nodeCount") },
      ),
      if ((nodeCount >=0  && nodeCount < 3) || nodeCount == 4) {
      svg.svg(
        svg.fontSize := "smaller",
      svg.text(
        child.text <-- inputs(nodeCount)(0),
        svg.x := "30%",
        svg.y:="35%",
        svg.textAnchor := "middle",
        svg.fill:="white"
      ),
      svg.text(
        child.text <-- inputs(nodeCount)(1),
        svg.x := "30%",
        svg.y:="60%",
        svg.textAnchor := "middle",
        svg.fill:="white"
      ),
      svg.text(
        child.text <-- weights(nodeCount)(0),
        svg.x := "60%",
        svg.y:="35%",
        svg.textAnchor := "middle",
        svg.fill:="white"
      ),
      svg.text(
        child.text <-- weights(nodeCount)(1),
        svg.x := "60%",
        svg.y:="60%",
        svg.textAnchor := "middle",
        svg.fill:="white"
      )
      )} else if (nodeCount ==3) {
        svg.svg(
          svg.fontSize := "smaller",
          svg.text(
            child.text <-- inputs(nodeCount)(0),
            svg.x := "30%",
            svg.y:="35%",
            svg.textAnchor := "middle",
            svg.fill:="white"
          ),
          svg.text(
            child.text <-- inputs(nodeCount)(1),
            svg.x := "30%",
            svg.y:="50%",
            svg.textAnchor := "middle",
            svg.fill:="white"
          ),
          svg.text(
            child.text <-- inputs(nodeCount)(2),
            svg.x := "30%",
            svg.y:="65%",
            svg.textAnchor := "middle",
            svg.fill:="white"
          ),
          svg.text(
            child.text <-- weights(nodeCount)(0),
            svg.x := "60%",
            svg.y:="35%",
            svg.textAnchor := "middle",
            svg.fill:="white"
          ),
          svg.text(
            child.text <-- weights(nodeCount)(1),
            svg.x := "60%",
            svg.y:="50%",
            svg.textAnchor := "middle",
            svg.fill:="white"
          ),
          svg.text(
            child.text <-- weights(nodeCount)(2),
            svg.x := "60%",
            svg.y:="65%",
            svg.textAnchor := "middle",
            svg.fill:="white"
          )
          )
      }
      else emptyNode,
      svg.text(
        child.text <-- outputs(nodeCount),
        svg.x := "85%",
        svg.y:="50%",
        svg.textAnchor := "middle",
        svg.fill:="white"
      ),
        
    )
  )
end node 
