package model

class DataSet(val inputs: Array[Vec], val correctOutputs: Array[Vec]):
  def size = inputs.size
  require(size == correctOutputs.size)

object DataSet:
  /** Create a data set from file. */
  def trainData(): DataSet =
    val tmp = """
115,66:1
175,78:0
205,72:0
120,67:1
    """

    fromLines(tmp)

  def testData(): DataSet =
    val tmp = """
167,73:0
105,67:1
120,72:1
143,67:0
130,66:0
    """

    fromLines(tmp)

  /** Create a data set from a multi-line string.*/
  def fromLines(multiLineString: String): DataSet =
    val lines = multiLineString.trim.split("\n")
    val pairs = lines.map(_.split(":"))
    val inputs: Array[Vec]  = pairs.map(p => p(0).split(",").map(_.toDouble))
    val correct: Array[Vec] = pairs.map(p => p(1).split(",").map(_.toDouble))
    new DataSet(inputs, correct)