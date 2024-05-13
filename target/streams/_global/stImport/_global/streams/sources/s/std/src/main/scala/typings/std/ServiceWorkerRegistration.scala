package typings.std

import typings.std.stdStrings.updatefound
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This ServiceWorker API interface represents the service worker registration. You register a service worker to control one or more pages that share the same origin.
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration)
  */
@js.native
trait ServiceWorkerRegistration
  extends StObject
     with EventTarget {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/active) */
  /* standard dom */
  val active: org.scalajs.dom.ServiceWorker | Null = js.native
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_updatefound(
    `type`: updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updatefound(
    `type`: updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updatefound(
    `type`: updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/getNotifications) */
  /* standard dom */
  def getNotifications(): js.Promise[js.Array[org.scalajs.dom.Notification]] = js.native
  def getNotifications(filter: org.scalajs.dom.GetNotificationOptions): js.Promise[js.Array[org.scalajs.dom.Notification]] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/installing) */
  /* standard dom */
  val installing: org.scalajs.dom.ServiceWorker | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/navigationPreload) */
  /* standard dom */
  val navigationPreload: NavigationPreloadManager = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/updatefound_event) */
  /* standard dom */
  var onupdatefound: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/pushManager) */
  /* standard dom */
  val pushManager: org.scalajs.dom.PushManager = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_updatefound(
    `type`: updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_updatefound(
    `type`: updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_updatefound(
    `type`: updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/scope) */
  /* standard dom */
  val scope: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/showNotification) */
  /* standard dom */
  def showNotification(title: java.lang.String): js.Promise[Unit] = js.native
  def showNotification(title: java.lang.String, options: org.scalajs.dom.NotificationOptions): js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/unregister) */
  /* standard dom */
  def unregister(): js.Promise[scala.Boolean] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/update) */
  /* standard dom */
  def update(): js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/updateViaCache) */
  /* standard dom */
  val updateViaCache: ServiceWorkerUpdateViaCache = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/waiting) */
  /* standard dom */
  val waiting: org.scalajs.dom.ServiceWorker | Null = js.native
}
