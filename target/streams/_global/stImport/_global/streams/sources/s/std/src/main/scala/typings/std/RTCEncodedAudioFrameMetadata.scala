package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCEncodedAudioFrameMetadata extends StObject {
  
  /* standard dom */
  var contributingSources: js.UndefOr[js.Array[Double]] = js.undefined
  
  /* standard dom */
  var payloadType: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var sequenceNumber: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var synchronizationSource: js.UndefOr[Double] = js.undefined
}
object RTCEncodedAudioFrameMetadata {
  
  inline def apply(): RTCEncodedAudioFrameMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCEncodedAudioFrameMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCEncodedAudioFrameMetadata] (val x: Self) extends AnyVal {
    
    inline def setContributingSources(value: js.Array[Double]): Self = StObject.set(x, "contributingSources", value.asInstanceOf[js.Any])
    
    inline def setContributingSourcesUndefined: Self = StObject.set(x, "contributingSources", js.undefined)
    
    inline def setContributingSourcesVarargs(value: Double*): Self = StObject.set(x, "contributingSources", js.Array(value*))
    
    inline def setPayloadType(value: Double): Self = StObject.set(x, "payloadType", value.asInstanceOf[js.Any])
    
    inline def setPayloadTypeUndefined: Self = StObject.set(x, "payloadType", js.undefined)
    
    inline def setSequenceNumber(value: Double): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
    
    inline def setSequenceNumberUndefined: Self = StObject.set(x, "sequenceNumber", js.undefined)
    
    inline def setSynchronizationSource(value: Double): Self = StObject.set(x, "synchronizationSource", value.asInstanceOf[js.Any])
    
    inline def setSynchronizationSourceUndefined: Self = StObject.set(x, "synchronizationSource", js.undefined)
  }
}
