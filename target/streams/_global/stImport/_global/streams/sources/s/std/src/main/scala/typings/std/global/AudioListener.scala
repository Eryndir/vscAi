package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("AudioListener")
@js.native
/* standard dom */
open class AudioListener ()
  extends StObject
     with typings.std.AudioListener {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioListener/forwardX) */
  /* standard dom */
  /* CompleteClass */
  override val forwardX: org.scalajs.dom.AudioParam = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioListener/forwardY) */
  /* standard dom */
  /* CompleteClass */
  override val forwardY: org.scalajs.dom.AudioParam = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioListener/forwardZ) */
  /* standard dom */
  /* CompleteClass */
  override val forwardZ: org.scalajs.dom.AudioParam = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioListener/positionX) */
  /* standard dom */
  /* CompleteClass */
  override val positionX: org.scalajs.dom.AudioParam = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioListener/positionY) */
  /* standard dom */
  /* CompleteClass */
  override val positionY: org.scalajs.dom.AudioParam = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioListener/positionZ) */
  /* standard dom */
  /* CompleteClass */
  override val positionZ: org.scalajs.dom.AudioParam = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioListener/setOrientation)
    */
  /* standard dom */
  /* CompleteClass */
  override def setOrientation(x: Double, y: Double, z: Double, xUp: Double, yUp: Double, zUp: Double): Unit = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioListener/setPosition)
    */
  /* standard dom */
  /* CompleteClass */
  override def setPosition(x: Double, y: Double, z: Double): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioListener/upX) */
  /* standard dom */
  /* CompleteClass */
  override val upX: org.scalajs.dom.AudioParam = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioListener/upY) */
  /* standard dom */
  /* CompleteClass */
  override val upY: org.scalajs.dom.AudioParam = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioListener/upZ) */
  /* standard dom */
  /* CompleteClass */
  override val upZ: org.scalajs.dom.AudioParam = js.native
}
