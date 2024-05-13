package typings.std

import typings.std.stdStrings.connectionstatechange
import typings.std.stdStrings.datachannel
import typings.std.stdStrings.icecandidate
import typings.std.stdStrings.icecandidateerror
import typings.std.stdStrings.iceconnectionstatechange
import typings.std.stdStrings.icegatheringstatechange
import typings.std.stdStrings.negotiationneeded
import typings.std.stdStrings.signalingstatechange
import typings.std.stdStrings.track
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A WebRTC connection between the local computer and a remote peer. It provides methods to connect to a remote peer, maintain and monitor the connection, and close the connection once it's no longer needed.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection)
  */
@js.native
trait RTCPeerConnection
  extends StObject
     with EventTarget {
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_connectionstatechange(
    `type`: connectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_connectionstatechange(
    `type`: connectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_connectionstatechange(
    `type`: connectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_datachannel(
    `type`: datachannel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.RTCDataChannelEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_datachannel(
    `type`: datachannel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.RTCDataChannelEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_datachannel(
    `type`: datachannel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.RTCDataChannelEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icecandidate(
    `type`: icecandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.RTCPeerConnectionIceEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icecandidate(
    `type`: icecandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.RTCPeerConnectionIceEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icecandidate(
    `type`: icecandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.RTCPeerConnectionIceEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icecandidateerror(
    `type`: icecandidateerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceErrorEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icecandidateerror(
    `type`: icecandidateerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceErrorEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icecandidateerror(
    `type`: icecandidateerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceErrorEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_iceconnectionstatechange(
    `type`: iceconnectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_iceconnectionstatechange(
    `type`: iceconnectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_iceconnectionstatechange(
    `type`: iceconnectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icegatheringstatechange(
    `type`: icegatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icegatheringstatechange(
    `type`: icegatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icegatheringstatechange(
    `type`: icegatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_negotiationneeded(
    `type`: negotiationneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_negotiationneeded(
    `type`: negotiationneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_negotiationneeded(
    `type`: negotiationneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_signalingstatechange(
    `type`: signalingstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_signalingstatechange(
    `type`: signalingstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_signalingstatechange(
    `type`: signalingstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_track(`type`: track, listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_track(
    `type`: track,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_track(
    `type`: track,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/addIceCandidate) */
  /* standard dom */
  def addIceCandidate(): js.Promise[Unit] = js.native
  def addIceCandidate(candidate: org.scalajs.dom.RTCIceCandidateInit): js.Promise[Unit] = js.native
  /** @deprecated */
  /* standard dom */
  def addIceCandidate(
    candidate: org.scalajs.dom.RTCIceCandidateInit,
    successCallback: VoidFunction,
    failureCallback: RTCPeerConnectionErrorCallback
  ): js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/addTrack) */
  /* standard dom */
  def addTrack(track: org.scalajs.dom.MediaStreamTrack, streams: org.scalajs.dom.MediaStream*): RTCRtpSender = js.native
  
  def addTransceiver(trackOrKind: java.lang.String): RTCRtpTransceiver = js.native
  def addTransceiver(trackOrKind: java.lang.String, init: RTCRtpTransceiverInit): RTCRtpTransceiver = js.native
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/addTransceiver) */
  /* standard dom */
  def addTransceiver(trackOrKind: org.scalajs.dom.MediaStreamTrack): RTCRtpTransceiver = js.native
  def addTransceiver(trackOrKind: org.scalajs.dom.MediaStreamTrack, init: RTCRtpTransceiverInit): RTCRtpTransceiver = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/canTrickleIceCandidates) */
  /* standard dom */
  val canTrickleIceCandidates: scala.Boolean | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/close) */
  /* standard dom */
  def close(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/connectionState) */
  /* standard dom */
  val connectionState: RTCPeerConnectionState = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/createAnswer) */
  /* standard dom */
  def createAnswer(): js.Promise[org.scalajs.dom.RTCSessionDescriptionInit] = js.native
  def createAnswer(options: RTCAnswerOptions): js.Promise[org.scalajs.dom.RTCSessionDescriptionInit] = js.native
  /** @deprecated */
  /* standard dom */
  def createAnswer(successCallback: RTCSessionDescriptionCallback, failureCallback: RTCPeerConnectionErrorCallback): js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/createDataChannel) */
  /* standard dom */
  def createDataChannel(label: java.lang.String): org.scalajs.dom.RTCDataChannel = js.native
  def createDataChannel(label: java.lang.String, dataChannelDict: org.scalajs.dom.RTCDataChannelInit): org.scalajs.dom.RTCDataChannel = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/createOffer) */
  /* standard dom */
  def createOffer(): js.Promise[org.scalajs.dom.RTCSessionDescriptionInit] = js.native
  def createOffer(options: org.scalajs.dom.RTCOfferOptions): js.Promise[org.scalajs.dom.RTCSessionDescriptionInit] = js.native
  /** @deprecated */
  /* standard dom */
  def createOffer(successCallback: RTCSessionDescriptionCallback, failureCallback: RTCPeerConnectionErrorCallback): js.Promise[Unit] = js.native
  def createOffer(
    successCallback: RTCSessionDescriptionCallback,
    failureCallback: RTCPeerConnectionErrorCallback,
    options: org.scalajs.dom.RTCOfferOptions
  ): js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/currentLocalDescription) */
  /* standard dom */
  val currentLocalDescription: org.scalajs.dom.RTCSessionDescription | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/currentRemoteDescription) */
  /* standard dom */
  val currentRemoteDescription: org.scalajs.dom.RTCSessionDescription | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/getConfiguration) */
  /* standard dom */
  def getConfiguration(): org.scalajs.dom.RTCConfiguration = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/getReceivers) */
  /* standard dom */
  def getReceivers(): js.Array[RTCRtpReceiver] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/getSenders) */
  /* standard dom */
  def getSenders(): js.Array[RTCRtpSender] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/getStats) */
  /* standard dom */
  def getStats(): js.Promise[org.scalajs.dom.RTCStatsReport] = js.native
  def getStats(selector: org.scalajs.dom.MediaStreamTrack): js.Promise[org.scalajs.dom.RTCStatsReport] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/getTransceivers) */
  /* standard dom */
  def getTransceivers(): js.Array[RTCRtpTransceiver] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/iceConnectionState) */
  /* standard dom */
  val iceConnectionState: org.scalajs.dom.RTCIceConnectionState = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/iceGatheringState) */
  /* standard dom */
  val iceGatheringState: org.scalajs.dom.RTCIceGatheringState = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/localDescription) */
  /* standard dom */
  val localDescription: org.scalajs.dom.RTCSessionDescription | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/connectionstatechange_event) */
  /* standard dom */
  var onconnectionstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/datachannel_event) */
  /* standard dom */
  var ondatachannel: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.RTCDataChannelEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/icecandidate_event) */
  /* standard dom */
  var onicecandidate: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.RTCPeerConnectionIceEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/icecandidateerror_event) */
  /* standard dom */
  var onicecandidateerror: (js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceErrorEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/iceconnectionstatechange_event) */
  /* standard dom */
  var oniceconnectionstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/icegatheringstatechange_event) */
  /* standard dom */
  var onicegatheringstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/negotiationneeded_event) */
  /* standard dom */
  var onnegotiationneeded: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/signalingstatechange_event) */
  /* standard dom */
  var onsignalingstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/track_event) */
  /* standard dom */
  var ontrack: (js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/pendingLocalDescription) */
  /* standard dom */
  val pendingLocalDescription: org.scalajs.dom.RTCSessionDescription | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/pendingRemoteDescription) */
  /* standard dom */
  val pendingRemoteDescription: org.scalajs.dom.RTCSessionDescription | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/remoteDescription) */
  /* standard dom */
  val remoteDescription: org.scalajs.dom.RTCSessionDescription | Null = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_connectionstatechange(
    `type`: connectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_connectionstatechange(
    `type`: connectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_connectionstatechange(
    `type`: connectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_datachannel(
    `type`: datachannel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.RTCDataChannelEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_datachannel(
    `type`: datachannel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.RTCDataChannelEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_datachannel(
    `type`: datachannel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.RTCDataChannelEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icecandidate(
    `type`: icecandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.RTCPeerConnectionIceEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icecandidate(
    `type`: icecandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.RTCPeerConnectionIceEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icecandidate(
    `type`: icecandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.RTCPeerConnectionIceEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icecandidateerror(
    `type`: icecandidateerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceErrorEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icecandidateerror(
    `type`: icecandidateerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceErrorEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icecandidateerror(
    `type`: icecandidateerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceErrorEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_iceconnectionstatechange(
    `type`: iceconnectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_iceconnectionstatechange(
    `type`: iceconnectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_iceconnectionstatechange(
    `type`: iceconnectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icegatheringstatechange(
    `type`: icegatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icegatheringstatechange(
    `type`: icegatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icegatheringstatechange(
    `type`: icegatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_negotiationneeded(
    `type`: negotiationneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_negotiationneeded(
    `type`: negotiationneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_negotiationneeded(
    `type`: negotiationneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_signalingstatechange(
    `type`: signalingstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_signalingstatechange(
    `type`: signalingstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_signalingstatechange(
    `type`: signalingstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_track(`type`: track, listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_track(
    `type`: track,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_track(
    `type`: track,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/removeTrack) */
  /* standard dom */
  def removeTrack(sender: RTCRtpSender): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/restartIce) */
  /* standard dom */
  def restartIce(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/sctp) */
  /* standard dom */
  val sctp: RTCSctpTransport | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/setConfiguration) */
  /* standard dom */
  def setConfiguration(): Unit = js.native
  def setConfiguration(configuration: org.scalajs.dom.RTCConfiguration): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/setLocalDescription) */
  /* standard dom */
  def setLocalDescription(): js.Promise[Unit] = js.native
  def setLocalDescription(description: RTCLocalSessionDescriptionInit): js.Promise[Unit] = js.native
  /** @deprecated */
  /* standard dom */
  def setLocalDescription(
    description: RTCLocalSessionDescriptionInit,
    successCallback: VoidFunction,
    failureCallback: RTCPeerConnectionErrorCallback
  ): js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/setRemoteDescription) */
  /* standard dom */
  def setRemoteDescription(description: org.scalajs.dom.RTCSessionDescriptionInit): js.Promise[Unit] = js.native
  /** @deprecated */
  /* standard dom */
  def setRemoteDescription(
    description: org.scalajs.dom.RTCSessionDescriptionInit,
    successCallback: VoidFunction,
    failureCallback: RTCPeerConnectionErrorCallback
  ): js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/signalingState) */
  /* standard dom */
  val signalingState: org.scalajs.dom.RTCSignalingState = js.native
}
