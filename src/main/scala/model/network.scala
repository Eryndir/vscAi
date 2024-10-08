package model

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

  def getData: (List[Map[String, String]], List[Map[String, String]]) =
    var nodes: List[Map[String, String]] = List()
    var links: List[Map[String, String]] = List()
    println("inputlayer:")
    for inputIdx <- 0 until input.length yield
      nodes = nodes :+ Map("id" -> s"n0$inputIdx")
    for layer <- 0 until layerSizes.length yield
      for index <- 0 until layerSizes(layer) yield 
        val id = s"n${layer+1}$index"
        nodes = nodes :+ Map("id" -> id)
        
        if (layer > 0) {
          for i <- 0 until layerSizes(layer-1) yield
            links = links :+ Map("source" -> s"n$layer$i", "target" -> id)
        } else {
          for i <- 0 until inputSize yield
            links = links :+ Map("source" -> s"n0$i", "target" -> id)
        }

    return (nodes, links)
  end getData

  def getBias(nodeId: String): String = 
    val layer = nodeId.charAt(0).asDigit
    println(nodeId)
    println(layer)
    
    val index = nodeId.charAt(1).asDigit
    val bias = ai.neurons(layer)(index).bias
    return s"$bias".substring(0,4)
  
  def getWeights(nodeId: String): IndexedSeq[String] = 
    val layer = nodeId.charAt(0).asDigit
    
    val index = nodeId.charAt(1).asDigit
    val weights = ai.neurons(layer)(index).weights

    val weightsString = (
            for index <- 0 until weights.length
            yield weights(index).toString().substring(0, 4)
        )

    return weightsString

  def getOutput(nodeId: String): String = 
    val layer = nodeId.charAt(0).asDigit
    
    val index = nodeId.charAt(1).asDigit
    if(layer <0) {
      return input(index).toString()
    }
    val outs = ai.neurons(layer)(index).output().toString()

    if(outs.length() > 2){
      return outs.substring(0,2) +"···"+ (outs takeRight 4)
    } else {
      return outs
    }
    
      