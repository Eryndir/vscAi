package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportDatagramDuplexStream)
  */
trait WebTransportDatagramDuplexStream extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportDatagramDuplexStream/incomingHighWaterMark) */
  /* standard dom */
  var incomingHighWaterMark: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportDatagramDuplexStream/incomingMaxAge) */
  /* standard dom */
  var incomingMaxAge: Double | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportDatagramDuplexStream/maxDatagramSize) */
  /* standard dom */
  val maxDatagramSize: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportDatagramDuplexStream/outgoingHighWaterMark) */
  /* standard dom */
  var outgoingHighWaterMark: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportDatagramDuplexStream/outgoingMaxAge) */
  /* standard dom */
  var outgoingMaxAge: Double | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportDatagramDuplexStream/readable) */
  /* standard dom */
  val readable: org.scalajs.dom.ReadableStream[Any]
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportDatagramDuplexStream/writable) */
  /* standard dom */
  val writable: WritableStream[Any]
}
object WebTransportDatagramDuplexStream {
  
  inline def apply(
    incomingHighWaterMark: Double,
    maxDatagramSize: Double,
    outgoingHighWaterMark: Double,
    readable: org.scalajs.dom.ReadableStream[Any],
    writable: WritableStream[Any]
  ): WebTransportDatagramDuplexStream = {
    val __obj = js.Dynamic.literal(incomingHighWaterMark = incomingHighWaterMark.asInstanceOf[js.Any], maxDatagramSize = maxDatagramSize.asInstanceOf[js.Any], outgoingHighWaterMark = outgoingHighWaterMark.asInstanceOf[js.Any], readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any], incomingMaxAge = null, outgoingMaxAge = null)
    __obj.asInstanceOf[WebTransportDatagramDuplexStream]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebTransportDatagramDuplexStream] (val x: Self) extends AnyVal {
    
    inline def setIncomingHighWaterMark(value: Double): Self = StObject.set(x, "incomingHighWaterMark", value.asInstanceOf[js.Any])
    
    inline def setIncomingMaxAge(value: Double): Self = StObject.set(x, "incomingMaxAge", value.asInstanceOf[js.Any])
    
    inline def setIncomingMaxAgeNull: Self = StObject.set(x, "incomingMaxAge", null)
    
    inline def setMaxDatagramSize(value: Double): Self = StObject.set(x, "maxDatagramSize", value.asInstanceOf[js.Any])
    
    inline def setOutgoingHighWaterMark(value: Double): Self = StObject.set(x, "outgoingHighWaterMark", value.asInstanceOf[js.Any])
    
    inline def setOutgoingMaxAge(value: Double): Self = StObject.set(x, "outgoingMaxAge", value.asInstanceOf[js.Any])
    
    inline def setOutgoingMaxAgeNull: Self = StObject.set(x, "outgoingMaxAge", null)
    
    inline def setReadable(value: org.scalajs.dom.ReadableStream[Any]): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
    
    inline def setWritable(value: WritableStream[Any]): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
  }
}
