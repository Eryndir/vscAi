package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Corresponds to the <image> element.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGImageElement)
  */
@js.native
trait SVGImageElement
  extends StObject
     with SVGGraphicsElement
     with SVGURIReference {
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGImageElement/crossorigin) */
  /* standard dom */
  var crossOrigin: java.lang.String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGImageElement/height) */
  /* standard dom */
  val height: org.scalajs.dom.SVGAnimatedLength = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGImageElement/preserveAspectRatio) */
  /* standard dom */
  val preserveAspectRatio: org.scalajs.dom.SVGAnimatedPreserveAspectRatio = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGImageElement/width) */
  /* standard dom */
  val width: org.scalajs.dom.SVGAnimatedLength = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGImageElement/x) */
  /* standard dom */
  val x: org.scalajs.dom.SVGAnimatedLength = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGImageElement/y) */
  /* standard dom */
  val y: org.scalajs.dom.SVGAnimatedLength = js.native
}
