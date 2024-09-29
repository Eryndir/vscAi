package model

val welcomeMessage = "Welcome to AI SEX CLASSIFIER"

/** Convert a number between 0 and 1 to a binary sex. */
def binaryClassifier(x: Num): String = 
  if x > 0.5 
  then "Female" 
  else "Male  "

val trainData = DataSet.trainData()
val testData  = DataSet.testData()

var ai = new Network(inputSize = trainData.inputs(0).size, layerSizes = List(3,2,1))

/** Show any text in color in terminal using for example colorCode=Console.RED */
def showColor(text: String, colorCode: String): String = 
  colorCode + text + Console.RESET

/** Use data to test our ai. A loss close to zero represents high certainty. **/

def testCountReturn(data: DataSet):Int = 
  var count = 0
  for i <- data.inputs.indices do
    val predicted = ai.predict(data.inputs(i))
    val correct = data.correctOutputs(i)
    val loss = meanSquareError(predicted, correct)

    if binaryClassifier(correct(0)) == binaryClassifier(predicted(0)) then count +=1
  return count

def test(data: DataSet): Unit =
  for i <- data.inputs.indices do
    val predicted = ai.predict(data.inputs(i))
    val correct = data.correctOutputs(i)
    val loss = meanSquareError(predicted, correct)

    val showPredicted = 
      if binaryClassifier(correct(0)) == binaryClassifier(predicted(0)) 
      then showColor(binaryClassifier(predicted(0)), Console.GREEN)
      else showColor(binaryClassifier(predicted(0)), Console.RED)

    println(
      s"${data.inputs(i).mkString(",")} " +
      s"correct=${binaryClassifier(correct(0))} ${correct.mkString(",")}  " +
      s"predicted=$showPredicted  ${predicted.mkString(",")} loss=$loss") 

/** The main program. Run it in terminal with `scala-cli run .` */

def createNetwork =
  ai = new Network(inputSize = trainData.inputs(0).size, layerSizes = List(3,2,1))

def runAi = 
  println(s"\n--- $welcomeMessage\n")
  println(ai.show)
  val n = 10
  println(s"\n--- TRAINING in $n cycles")
  ai.train(cycles = n,  data = trainData)
  println(s"\n--- TESTING")
  test(testData)

def trainAi =
  ai.train(cycles = 10,  data = trainData)

def trainAi(data: DataSet): Unit =
  println(data.inputs(0)(0))
  ai.train(cycles = 10,  data = data)

def testAi(inputLength:String, inputWeight: String) = 
  val predicted = ai.predict(Array(inputLength.toDouble, inputWeight.toDouble))
  println(binaryClassifier(predicted(0)))

def testAiReturn(inputLength:String, inputWeight: String): String= 
  val predicted = ai.predict(Array(inputLength.toDouble, inputWeight.toDouble))
  return binaryClassifier(predicted(0))