package typings.std.global

import typings.std.RTCEncodedAudioFrameMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("RTCEncodedAudioFrame")
@js.native
/* standard dom */
open class RTCEncodedAudioFrame ()
  extends StObject
     with typings.std.RTCEncodedAudioFrame {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedAudioFrame/data) */
  /* standard dom */
  /* CompleteClass */
  var data: js.typedarray.ArrayBuffer = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedAudioFrame/getMetadata) */
  /* standard dom */
  /* CompleteClass */
  override def getMetadata(): RTCEncodedAudioFrameMetadata = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedAudioFrame/timestamp) */
  /* standard dom */
  /* CompleteClass */
  override val timestamp: Double = js.native
}
