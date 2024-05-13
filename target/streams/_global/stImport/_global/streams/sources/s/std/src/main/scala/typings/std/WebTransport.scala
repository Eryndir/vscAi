package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport)
  */
@js.native
trait WebTransport extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/close) */
  /* standard dom */
  def close(): Unit = js.native
  def close(closeInfo: WebTransportCloseInfo): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/closed) */
  /* standard dom */
  val closed: js.Promise[WebTransportCloseInfo] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/createBidirectionalStream) */
  /* standard dom */
  def createBidirectionalStream(): js.Promise[WebTransportBidirectionalStream] = js.native
  def createBidirectionalStream(options: WebTransportSendStreamOptions): js.Promise[WebTransportBidirectionalStream] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/createUnidirectionalStream) */
  /* standard dom */
  def createUnidirectionalStream(): js.Promise[WritableStream[Any]] = js.native
  def createUnidirectionalStream(options: WebTransportSendStreamOptions): js.Promise[WritableStream[Any]] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/datagrams) */
  /* standard dom */
  val datagrams: WebTransportDatagramDuplexStream = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/incomingBidirectionalStreams) */
  /* standard dom */
  val incomingBidirectionalStreams: org.scalajs.dom.ReadableStream[Any] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/incomingUnidirectionalStreams) */
  /* standard dom */
  val incomingUnidirectionalStreams: org.scalajs.dom.ReadableStream[Any] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/ready) */
  /* standard dom */
  val ready: js.Promise[Unit] = js.native
}
