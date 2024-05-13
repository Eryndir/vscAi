package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides the ability to control and obtain details about how a particular MediaStreamTrack is encoded and sent to a remote peer.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender)
  */
@js.native
trait RTCRtpSender extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/dtmf) */
  /* standard dom */
  val dtmf: org.scalajs.dom.RTCDTMFSender | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/getParameters) */
  /* standard dom */
  def getParameters(): RTCRtpSendParameters = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/getStats) */
  /* standard dom */
  def getStats(): js.Promise[org.scalajs.dom.RTCStatsReport] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/replaceTrack) */
  /* standard dom */
  def replaceTrack(): js.Promise[Unit] = js.native
  def replaceTrack(withTrack: org.scalajs.dom.MediaStreamTrack): js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/setParameters) */
  /* standard dom */
  def setParameters(parameters: RTCRtpSendParameters): js.Promise[Unit] = js.native
  def setParameters(parameters: RTCRtpSendParameters, setParameterOptions: RTCSetParameterOptions): js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/setStreams) */
  /* standard dom */
  def setStreams(streams: org.scalajs.dom.MediaStream*): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/track) */
  /* standard dom */
  val track: org.scalajs.dom.MediaStreamTrack | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/transform) */
  /* standard dom */
  var transform: RTCRtpTransform | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/transport) */
  /* standard dom */
  val transport: RTCDtlsTransport | Null = js.native
}
