package typings.std.global

import org.scalajs.dom.ResponseInit
import org.scalajs.dom.ResponseType
import typings.std.BodyInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Response")
@js.native
/* standard dom */
open class Response ()
  extends StObject
     with typings.std.Response {
  def this(body: BodyInit) = this()
  def this(body: Null, init: ResponseInit) = this()
  def this(body: Unit, init: ResponseInit) = this()
  def this(body: BodyInit, init: ResponseInit) = this()
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/arrayBuffer) */
  /* standard dom */
  /* CompleteClass */
  override def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/blob) */
  /* standard dom */
  /* CompleteClass */
  override def blob(): js.Promise[org.scalajs.dom.Blob] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/body) */
  /* standard dom */
  /* CompleteClass */
  override val body: org.scalajs.dom.ReadableStream[js.typedarray.Uint8Array] | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/bodyUsed) */
  /* standard dom */
  /* CompleteClass */
  override val bodyUsed: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/formData) */
  /* standard dom */
  /* CompleteClass */
  override def formData(): js.Promise[org.scalajs.dom.FormData] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/headers) */
  /* standard dom */
  /* CompleteClass */
  override val headers: org.scalajs.dom.Headers = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/json) */
  /* standard dom */
  /* CompleteClass */
  override def json(): js.Promise[Any] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/ok) */
  /* standard dom */
  /* CompleteClass */
  override val ok: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/redirected) */
  /* standard dom */
  /* CompleteClass */
  override val redirected: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/status) */
  /* standard dom */
  /* CompleteClass */
  override val status: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/statusText) */
  /* standard dom */
  /* CompleteClass */
  override val statusText: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/text) */
  /* standard dom */
  /* CompleteClass */
  override def text(): js.Promise[java.lang.String] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/type) */
  /* standard dom */
  /* CompleteClass */
  override val `type`: ResponseType = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/url) */
  /* standard dom */
  /* CompleteClass */
  override val url: java.lang.String = js.native
}
object Response {
  
  @JSGlobal("Response")
  @js.native
  val ^ : js.Any = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/error_static) */
  /* standard dom */
  inline def error(): org.scalajs.dom.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("error")().asInstanceOf[org.scalajs.dom.Response]
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/json_static) */
  /* standard dom */
  inline def json(data: Any): org.scalajs.dom.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(data.asInstanceOf[js.Any]).asInstanceOf[org.scalajs.dom.Response]
  inline def json(data: Any, init: ResponseInit): org.scalajs.dom.Response = (^.asInstanceOf[js.Dynamic].applyDynamic("json")(data.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.Response]
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/redirect_static) */
  /* standard dom */
  inline def redirect(url: java.lang.String): org.scalajs.dom.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any]).asInstanceOf[org.scalajs.dom.Response]
  inline def redirect(url: java.lang.String, status: Double): org.scalajs.dom.Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.Response]
  inline def redirect(url: org.scalajs.dom.URL): org.scalajs.dom.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any]).asInstanceOf[org.scalajs.dom.Response]
  inline def redirect(url: org.scalajs.dom.URL, status: Double): org.scalajs.dom.Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.Response]
}
