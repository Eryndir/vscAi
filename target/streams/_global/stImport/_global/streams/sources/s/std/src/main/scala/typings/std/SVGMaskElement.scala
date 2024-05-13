package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to the properties of <mask> elements, as well as methods to manipulate them.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMaskElement)
  */
@js.native
trait SVGMaskElement
  extends StObject
     with SVGElement {
  
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
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMaskElement/height) */
  /* standard dom */
  val height: org.scalajs.dom.SVGAnimatedLength = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMaskElement/maskContentUnits) */
  /* standard dom */
  val maskContentUnits: org.scalajs.dom.SVGAnimatedEnumeration = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMaskElement/maskUnits) */
  /* standard dom */
  val maskUnits: org.scalajs.dom.SVGAnimatedEnumeration = js.native
  
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
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMaskElement/width) */
  /* standard dom */
  val width: org.scalajs.dom.SVGAnimatedLength = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMaskElement/x) */
  /* standard dom */
  val x: org.scalajs.dom.SVGAnimatedLength = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMaskElement/y) */
  /* standard dom */
  val y: org.scalajs.dom.SVGAnimatedLength = js.native
}
