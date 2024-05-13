file://<WORKSPACE>/src/main/scala/model/network.scala
### java.lang.AssertionError: assertion failed: position error, parent span does not contain child span
parent      = new Vec(null) # -1,
parent span = <3212..3545>,
child       = null # -1,
child span  = [3227..3548..3548]

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.2.2
Classpath:
<WORKSPACE>/.bloop/vscAi/bloop-bsp-clients-classes/classes-Metals-joxEksUjTJa-XiBQQM1lZA== [exists ], <HOME>/.cache/bloop/semanticdb/com.sourcegraph.semanticdb-javac.0.9.9/semanticdb-javac-0.9.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_sjs1_3/3.2.2/scala3-library_sjs1_3-3.2.2.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-js/scalajs-library_2.13/1.16.0/scalajs-library_2.13-1.16.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-js/scalajs-dom_sjs1_3/2.4.0/scalajs-dom_sjs1_3-2.4.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/raquo/laminar_sjs1_3/15.0.1/laminar_sjs1_3-15.0.1.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-format_sjs1_3/3.0.4-10adbf/jars/d3-format_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-dispatch_sjs1_3/3.0.6-8f84d1/jars/d3-dispatch_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-timer_sjs1_3/3.0.2-cc12e2/jars/d3-timer_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/std_sjs1_3/5.4-ba3953/jars/std_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-path_sjs1_3/3.1.0-13f581/jars/d3-path_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-color_sjs1_3/3.1.3-159401/jars/d3-color_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-interpolate_sjs1_3/3.0.4-6a17b3/jars/d3-interpolate_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/geojson_sjs1_3/7946.0.14-f9789d/jars/geojson_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-random_sjs1_3/3.0.3-fec72f/jars/d3-random_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-selection_sjs1_3/3.0.10-6b49a4/jars/d3-selection_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-dsv_sjs1_3/3.0.7-c3b0ce/jars/d3-dsv_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3_sjs1_3/7.4.3-28b66c/jars/d3_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-scale_sjs1_3/4.0.8-d62e0d/jars/d3-scale_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-delaunay_sjs1_3/6.0.4-92fc1a/jars/d3-delaunay_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-ease_sjs1_3/3.0.2-e52cb8/jars/d3-ease_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-drag_sjs1_3/3.0.7-5496a0/jars/d3-drag_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-force_sjs1_3/3.0.9-cdcdbc/jars/d3-force_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-chord_sjs1_3/3.0.6-40ce73/jars/d3-chord_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-axis_sjs1_3/3.0.6-9b0c79/jars/d3-axis_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-brush_sjs1_3/3.0.6-ad4503/jars/d3-brush_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-quadtree_sjs1_3/3.0.6-71099a/jars/d3-quadtree_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-hierarchy_sjs1_3/3.1.7-507bff/jars/d3-hierarchy_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-zoom_sjs1_3/3.0.8-e9b983/jars/d3-zoom_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-fetch_sjs1_3/3.0.7-f2d48a/jars/d3-fetch_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-time_sjs1_3/3.0.3-09657d/jars/d3-time_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-time-format_sjs1_3/4.0.3-46bf4e/jars/d3-time-format_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-shape_sjs1_3/3.1.6-29be5c/jars/d3-shape_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-transition_sjs1_3/3.0.8-d6498a/jars/d3-transition_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-array_sjs1_3/3.2.1-45a8b3/jars/d3-array_sjs1_3.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/olvind/scalablytyped-runtime_sjs1_3/2.4.2/scalablytyped-runtime_sjs1_3-2.4.2.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-geo_sjs1_3/3.1.0-8aabb7/jars/d3-geo_sjs1_3.jar [exists ], <HOME>/.ivy2/local/org.scalablytyped/d3-contour_sjs1_3/3.0.6-688c34/jars/d3-contour_sjs1_3.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.13/scala-library-2.13.13.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-js/scalajs-javalib/1.16.0/scalajs-javalib-1.16.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-js/scalajs-scalalib_2.13/2.13.13%2B1.16.0/scalajs-scalalib_2.13-2.13.13%2B1.16.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/raquo/airstream_sjs1_3/15.0.0/airstream_sjs1_3-15.0.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/raquo/ew_sjs1_3/0.1.2/ew_sjs1_3-0.1.2.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/app/tulz/tuplez-full-light_sjs1_3/0.4.0/tuplez-full-light_sjs1_3-0.4.0.jar [exists ]
Options:
-scalajs -Xsemanticdb -sourceroot <WORKSPACE>


action parameters:
offset: 3220
uri: file://<WORKSPACE>/src/main/scala/model/network.scala
text:
```scala
package model

import vscAi.layer
/** A Layer consists of many Neurons */
type Layer = Array[Neuron]

/** A simple model of a brain with several neurons in several layers. */
class Network(val inputSize: Int, val layerSizes: List[Int]):
  val input   = new Vec(inputSize)
  val outputs = new Array[Vec](layerSizes.length)
  val neurons = new Array[Layer](layerSizes.length)
  val lastLayer = layerSizes.length - 1
  
  for layer <- 0 until layerSizes.length do 
    // make room for neurons in layers and output vectors between layers
    neurons(layer) = new Layer(layerSizes(layer))
    outputs(layer) = new Vec(layerSizes(layer))
    for index <- 0 until layerSizes(layer) do 
      if layer == 0 
      then // neurons in the first layer are connected to input
        neurons(layer)(index) = new Neuron(input)
      else // other neurons are connected to the output of the previous layer
        neurons(layer)(index) = new Neuron(outputs(layer - 1))
  
  /** Walk through all neurons in all layers and forward outputs to next layer */
  def feedForward() = 
    for layer <- layerSizes.indices do
      for index <- outputs(layer).indices do
        outputs(layer)(index) = neurons(layer)(index).output()

  /** Use signal as input and feed forward to subsequent layers. */
  def predict(signal: Vec): Vec =
    for i <- input.indices do input(i) = signal(i)
    feedForward()
    outputs(lastLayer)
  
  /** Return layer and index of a randomly picked neuron in this network */
  def randomNeuron(): (Int, Int) = 
    val layer = util.Random.nextInt(layerSizes.length)
    val index = util.Random.nextInt(layerSizes(layer))
    (layer, index)
  
  /** Pick a random neuron and mutate its parameters.*/
  def mutateRandomNeuron(learningFactor: Num): (Int, Int) = 
    val (l, i) = randomNeuron()
    neurons(l)(i).mutate(learningFactor)
    (l, i)
  
  /** Run training cycles using data. The learningFactor controls the size of mutations.*/
  def train(cycles: Int, data: DataSet, learningFactor: Num = 0.3): Unit = 
    def computeLoss(): Num = 
      var averageLoss = 0.0
      var i = 0
      while i < data.size do
        val loss = meanSquareError(predict(data.inputs(i)), data.correctOutputs(i))
        i += 1
        averageLoss = averageLoss + (loss - averageLoss)/i 
      end while
      averageLoss
    end computeLoss

    for cycle <- 1 to cycles do
      val loss1 = computeLoss()
      val (l, i) = mutateRandomNeuron(learningFactor)
      val loss2 = computeLoss()
      if cycle % (cycles / 10) == 0 then 
        println(s"cycle $cycle loss before mutation: $loss1 --- after mutation: $loss2")
      if loss2 < loss1
      then neurons(l)(i).save() 
      else neurons(l)(i).backtrack()
  end train
  
  /** Show this network with its neurons in each layer */
  def show: String = 
    val heading = s"Neural Network [inputSize=$inputSize, layerSizes=$layerSizes]"
    var body = 
      (
        for layer <- 0 until layerSizes.length yield
          s"Layer $layer: " ++ (
            for index <- 0 until layerSizes(layer) 
            yield neurons(layer)(index).show
          ).mkString(", ")
      ).mkString("\n")
    s"$heading\n$body"

  def getData: Unit =
    var nodes = new Vec(@@[]
    println("inputlayer:")
    for layer <- 0 until layerSizes.length yield
      println("---")
      println(layerSizes(layer))
      for index <- 0 until layerSizes(layer) yield 
        println(s"n${layer+1}$index")
        nodes = nodes :+ Map("id" -> s"n${layer+1}$index")
        println(neurons(layer)(index).show)
  end getData
  
```



#### Error stacktrace:

```
scala.runtime.Scala3RunTime$.assertFailed(Scala3RunTime.scala:8)
	dotty.tools.dotc.ast.Positioned.check$1(Positioned.scala:172)
	dotty.tools.dotc.ast.Positioned.check$1$$anonfun$3(Positioned.scala:202)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.immutable.List.foreach(List.scala:333)
	dotty.tools.dotc.ast.Positioned.check$1(Positioned.scala:202)
	dotty.tools.dotc.ast.Positioned.checkPos(Positioned.scala:223)
	dotty.tools.dotc.ast.Positioned.check$1(Positioned.scala:197)
	dotty.tools.dotc.ast.Positioned.checkPos(Positioned.scala:223)
	dotty.tools.dotc.ast.Positioned.check$1(Positioned.scala:197)
	dotty.tools.dotc.ast.Positioned.check$1$$anonfun$3(Positioned.scala:202)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.immutable.List.foreach(List.scala:333)
	dotty.tools.dotc.ast.Positioned.check$1(Positioned.scala:202)
	dotty.tools.dotc.ast.Positioned.checkPos(Positioned.scala:223)
	dotty.tools.dotc.ast.Positioned.check$1(Positioned.scala:197)
	dotty.tools.dotc.ast.Positioned.checkPos(Positioned.scala:223)
	dotty.tools.dotc.ast.Positioned.check$1(Positioned.scala:197)
	dotty.tools.dotc.ast.Positioned.check$1$$anonfun$3(Positioned.scala:202)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.immutable.List.foreach(List.scala:333)
	dotty.tools.dotc.ast.Positioned.check$1(Positioned.scala:202)
	dotty.tools.dotc.ast.Positioned.checkPos(Positioned.scala:223)
	dotty.tools.dotc.ast.Positioned.check$1(Positioned.scala:197)
	dotty.tools.dotc.ast.Positioned.checkPos(Positioned.scala:223)
	dotty.tools.dotc.ast.Positioned.check$1(Positioned.scala:197)
	dotty.tools.dotc.ast.Positioned.check$1$$anonfun$3(Positioned.scala:202)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.immutable.List.foreach(List.scala:333)
	dotty.tools.dotc.ast.Positioned.check$1(Positioned.scala:202)
	dotty.tools.dotc.ast.Positioned.checkPos(Positioned.scala:223)
	dotty.tools.dotc.parsing.Parser.parse$$anonfun$1(ParserPhase.scala:38)
	dotty.tools.dotc.parsing.Parser.parse$$anonfun$adapted$1(ParserPhase.scala:39)
	scala.Function0.apply$mcV$sp(Function0.scala:42)
	dotty.tools.dotc.core.Phases$Phase.monitor(Phases.scala:429)
	dotty.tools.dotc.parsing.Parser.parse(ParserPhase.scala:39)
	dotty.tools.dotc.parsing.Parser.runOn$$anonfun$1(ParserPhase.scala:48)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.immutable.List.foreach(List.scala:333)
	dotty.tools.dotc.parsing.Parser.runOn(ParserPhase.scala:48)
	dotty.tools.dotc.Run.runPhases$1$$anonfun$1(Run.scala:238)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.ArrayOps$.foreach$extension(ArrayOps.scala:1321)
	dotty.tools.dotc.Run.runPhases$1(Run.scala:249)
	dotty.tools.dotc.Run.compileUnits$$anonfun$1(Run.scala:257)
	dotty.tools.dotc.Run.compileUnits$$anonfun$adapted$1(Run.scala:266)
	dotty.tools.dotc.util.Stats$.maybeMonitored(Stats.scala:68)
	dotty.tools.dotc.Run.compileUnits(Run.scala:266)
	dotty.tools.dotc.Run.compileSources(Run.scala:190)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:165)
	scala.meta.internal.pc.MetalsDriver.run(MetalsDriver.scala:45)
	scala.meta.internal.pc.SignatureHelpProvider$.signatureHelp(SignatureHelpProvider.scala:40)
	scala.meta.internal.pc.ScalaPresentationCompiler.signatureHelp$$anonfun$1(ScalaPresentationCompiler.scala:414)
```
#### Short summary: 

java.lang.AssertionError: assertion failed: position error, parent span does not contain child span
parent      = new Vec(null) # -1,
parent span = <3212..3545>,
child       = null # -1,
child span  = [3227..3548..3548]