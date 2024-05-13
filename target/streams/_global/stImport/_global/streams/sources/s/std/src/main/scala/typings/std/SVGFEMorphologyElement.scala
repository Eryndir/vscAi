package typings.std

import typings.std.stdInts.`0`
import typings.std.stdInts.`1`
import typings.std.stdInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Corresponds to the <feMorphology> element.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEMorphologyElement)
  */
@js.native
trait SVGFEMorphologyElement
  extends StObject
     with SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  
  /* standard dom */
  val SVG_MORPHOLOGY_OPERATOR_DILATE: `2` = js.native
  
  /* standard dom */
  val SVG_MORPHOLOGY_OPERATOR_ERODE: `1` = js.native
  
  /* standard dom */
  val SVG_MORPHOLOGY_OPERATOR_UNKNOWN: `0` = js.native
  
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
  
  /* standard dom */
  val in1: org.scalajs.dom.SVGAnimatedString = js.native
  
  /* standard dom */
  val operator: org.scalajs.dom.SVGAnimatedEnumeration = js.native
  
  /* standard dom */
  val radiusX: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard dom */
  val radiusY: org.scalajs.dom.SVGAnimatedNumber = js.native
  
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
}
