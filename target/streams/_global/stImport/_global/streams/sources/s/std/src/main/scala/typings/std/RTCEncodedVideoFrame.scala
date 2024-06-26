package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedVideoFrame) */
trait RTCEncodedVideoFrame extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedVideoFrame/data) */
  /* standard dom */
  var data: js.typedarray.ArrayBuffer
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedVideoFrame/getMetadata) */
  /* standard dom */
  def getMetadata(): RTCEncodedVideoFrameMetadata
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedVideoFrame/timestamp) */
  /* standard dom */
  val timestamp: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedVideoFrame/type) */
  /* standard dom */
  val `type`: RTCEncodedVideoFrameType
}
object RTCEncodedVideoFrame {
  
  inline def apply(
    data: js.typedarray.ArrayBuffer,
    getMetadata: () => RTCEncodedVideoFrameMetadata,
    timestamp: Double,
    `type`: RTCEncodedVideoFrameType
  ): RTCEncodedVideoFrame = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getMetadata = js.Any.fromFunction0(getMetadata), timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCEncodedVideoFrame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCEncodedVideoFrame] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setGetMetadata(value: () => RTCEncodedVideoFrameMetadata): Self = StObject.set(x, "getMetadata", js.Any.fromFunction0(value))
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: RTCEncodedVideoFrameType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
