package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("WebTransportDatagramDuplexStream")
@js.native
/* standard dom */
open class WebTransportDatagramDuplexStream ()
  extends StObject
     with typings.std.WebTransportDatagramDuplexStream {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportDatagramDuplexStream/incomingHighWaterMark) */
  /* standard dom */
  /* CompleteClass */
  var incomingHighWaterMark: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportDatagramDuplexStream/incomingMaxAge) */
  /* standard dom */
  /* CompleteClass */
  var incomingMaxAge: Double | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportDatagramDuplexStream/maxDatagramSize) */
  /* standard dom */
  /* CompleteClass */
  override val maxDatagramSize: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportDatagramDuplexStream/outgoingHighWaterMark) */
  /* standard dom */
  /* CompleteClass */
  var outgoingHighWaterMark: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportDatagramDuplexStream/outgoingMaxAge) */
  /* standard dom */
  /* CompleteClass */
  var outgoingMaxAge: Double | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportDatagramDuplexStream/readable) */
  /* standard dom */
  /* CompleteClass */
  override val readable: org.scalajs.dom.ReadableStream[Any] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportDatagramDuplexStream/writable) */
  /* standard dom */
  /* CompleteClass */
  override val writable: typings.std.WritableStream[Any] = js.native
}
