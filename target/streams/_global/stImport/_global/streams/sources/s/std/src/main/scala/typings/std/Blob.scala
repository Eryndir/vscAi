package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A file-like object of immutable, raw data. Blobs represent data that isn't necessarily in a JavaScript-native format. The File interface is based on Blob, inheriting blob functionality and expanding it to support files on the user's system.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob)
  */
@js.native
trait Blob extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/arrayBuffer) */
  /* standard dom */
  def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/size) */
  /* standard dom */
  val size: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/slice) */
  /* standard dom */
  def slice(): org.scalajs.dom.Blob = js.native
  def slice(start: Double): org.scalajs.dom.Blob = js.native
  def slice(start: Double, end: Double): org.scalajs.dom.Blob = js.native
  def slice(start: Double, end: Double, contentType: java.lang.String): org.scalajs.dom.Blob = js.native
  def slice(start: Double, end: Unit, contentType: java.lang.String): org.scalajs.dom.Blob = js.native
  def slice(start: Unit, end: Double): org.scalajs.dom.Blob = js.native
  def slice(start: Unit, end: Double, contentType: java.lang.String): org.scalajs.dom.Blob = js.native
  def slice(start: Unit, end: Unit, contentType: java.lang.String): org.scalajs.dom.Blob = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/stream) */
  /* standard dom */
  def stream(): org.scalajs.dom.ReadableStream[js.typedarray.Uint8Array] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/text) */
  /* standard dom */
  def text(): js.Promise[java.lang.String] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/type) */
  /* standard dom */
  val `type`: java.lang.String = js.native
}
