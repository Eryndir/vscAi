package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Inherits properties from its parent, AudioNode.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DynamicsCompressorNode)
  */
@js.native
trait DynamicsCompressorNode
  extends StObject
     with AudioNode {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DynamicsCompressorNode/attack) */
  /* standard dom */
  val attack: org.scalajs.dom.AudioParam = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DynamicsCompressorNode/knee) */
  /* standard dom */
  val knee: org.scalajs.dom.AudioParam = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DynamicsCompressorNode/ratio) */
  /* standard dom */
  val ratio: org.scalajs.dom.AudioParam = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DynamicsCompressorNode/reduction) */
  /* standard dom */
  val reduction: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DynamicsCompressorNode/release) */
  /* standard dom */
  val release: org.scalajs.dom.AudioParam = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DynamicsCompressorNode/threshold) */
  /* standard dom */
  val threshold: org.scalajs.dom.AudioParam = js.native
}
