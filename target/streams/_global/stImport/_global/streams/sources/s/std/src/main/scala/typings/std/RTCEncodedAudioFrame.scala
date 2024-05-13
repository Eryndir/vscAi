package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedAudioFrame) */
trait RTCEncodedAudioFrame extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedAudioFrame/data) */
  /* standard dom */
  var data: js.typedarray.ArrayBuffer
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedAudioFrame/getMetadata) */
  /* standard dom */
  def getMetadata(): RTCEncodedAudioFrameMetadata
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedAudioFrame/timestamp) */
  /* standard dom */
  val timestamp: Double
}
object RTCEncodedAudioFrame {
  
  inline def apply(
    data: js.typedarray.ArrayBuffer,
    getMetadata: () => RTCEncodedAudioFrameMetadata,
    timestamp: Double
  ): RTCEncodedAudioFrame = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getMetadata = js.Any.fromFunction0(getMetadata), timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCEncodedAudioFrame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCEncodedAudioFrame] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setGetMetadata(value: () => RTCEncodedAudioFrameMetadata): Self = StObject.set(x, "getMetadata", js.Any.fromFunction0(value))
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
