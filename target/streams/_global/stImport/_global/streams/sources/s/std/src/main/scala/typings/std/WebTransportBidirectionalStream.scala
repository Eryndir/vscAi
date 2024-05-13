package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportBidirectionalStream)
  */
trait WebTransportBidirectionalStream extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportBidirectionalStream/readable) */
  /* standard dom */
  val readable: org.scalajs.dom.ReadableStream[Any]
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportBidirectionalStream/writable) */
  /* standard dom */
  val writable: WritableStream[Any]
}
object WebTransportBidirectionalStream {
  
  inline def apply(readable: org.scalajs.dom.ReadableStream[Any], writable: WritableStream[Any]): WebTransportBidirectionalStream = {
    val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebTransportBidirectionalStream]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebTransportBidirectionalStream] (val x: Self) extends AnyVal {
    
    inline def setReadable(value: org.scalajs.dom.ReadableStream[Any]): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
    
    inline def setWritable(value: WritableStream[Any]): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
  }
}
