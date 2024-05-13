package typings.std.global

import typings.std.RTCRtpCapabilities
import typings.std.RTCRtpContributingSource
import typings.std.RTCRtpReceiveParameters
import typings.std.RTCRtpSynchronizationSource
import typings.std.RTCRtpTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("RTCRtpReceiver")
@js.native
/* standard dom */
open class RTCRtpReceiver ()
  extends StObject
     with typings.std.RTCRtpReceiver {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpReceiver/getContributingSources) */
  /* standard dom */
  /* CompleteClass */
  override def getContributingSources(): js.Array[RTCRtpContributingSource] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpReceiver/getParameters) */
  /* standard dom */
  /* CompleteClass */
  override def getParameters(): RTCRtpReceiveParameters = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpReceiver/getStats) */
  /* standard dom */
  /* CompleteClass */
  override def getStats(): js.Promise[org.scalajs.dom.RTCStatsReport] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpReceiver/getSynchronizationSources) */
  /* standard dom */
  /* CompleteClass */
  override def getSynchronizationSources(): js.Array[RTCRtpSynchronizationSource] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpReceiver/track) */
  /* standard dom */
  /* CompleteClass */
  override val track: org.scalajs.dom.MediaStreamTrack = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpReceiver/transform) */
  /* standard dom */
  /* CompleteClass */
  var transform: RTCRtpTransform | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpReceiver/transport) */
  /* standard dom */
  /* CompleteClass */
  override val transport: typings.std.RTCDtlsTransport | Null = js.native
}
object RTCRtpReceiver {
  
  @JSGlobal("RTCRtpReceiver")
  @js.native
  val ^ : js.Any = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpReceiver/getCapabilities_static) */
  /* standard dom */
  inline def getCapabilities(kind: java.lang.String): RTCRtpCapabilities | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getCapabilities")(kind.asInstanceOf[js.Any]).asInstanceOf[RTCRtpCapabilities | Null]
}
