package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The storage for Cache objects.
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CacheStorage)
  */
@js.native
trait CacheStorage extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CacheStorage/delete) */
  /* standard dom */
  def delete(cacheName: java.lang.String): js.Promise[scala.Boolean] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CacheStorage/has) */
  /* standard dom */
  def has(cacheName: java.lang.String): js.Promise[scala.Boolean] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CacheStorage/keys) */
  /* standard dom */
  def keys(): js.Promise[js.Array[java.lang.String]] = js.native
  
  def `match`(request: org.scalajs.dom.URL): js.Promise[js.UndefOr[org.scalajs.dom.Response]] = js.native
  def `match`(request: org.scalajs.dom.URL, options: MultiCacheQueryOptions): js.Promise[js.UndefOr[org.scalajs.dom.Response]] = js.native
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CacheStorage/match) */
  /* standard dom */
  def `match`(request: RequestInfo): js.Promise[js.UndefOr[org.scalajs.dom.Response]] = js.native
  def `match`(request: RequestInfo, options: MultiCacheQueryOptions): js.Promise[js.UndefOr[org.scalajs.dom.Response]] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CacheStorage/open) */
  /* standard dom */
  def open(cacheName: java.lang.String): js.Promise[org.scalajs.dom.Cache] = js.native
}
