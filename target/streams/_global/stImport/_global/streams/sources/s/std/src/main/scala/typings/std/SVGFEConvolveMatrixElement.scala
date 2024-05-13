package typings.std

import typings.std.stdInts.`0`
import typings.std.stdInts.`1`
import typings.std.stdInts.`2`
import typings.std.stdInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Corresponds to the <feConvolveMatrix> element.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEConvolveMatrixElement)
  */
@js.native
trait SVGFEConvolveMatrixElement
  extends StObject
     with SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  
  /* standard dom */
  val SVG_EDGEMODE_DUPLICATE: `1` = js.native
  
  /* standard dom */
  val SVG_EDGEMODE_NONE: `3` = js.native
  
  /* standard dom */
  val SVG_EDGEMODE_UNKNOWN: `0` = js.native
  
  /* standard dom */
  val SVG_EDGEMODE_WRAP: `2` = js.native
  
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
  val bias: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard dom */
  val divisor: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard dom */
  val edgeMode: org.scalajs.dom.SVGAnimatedEnumeration = js.native
  
  /* standard dom */
  val in1: org.scalajs.dom.SVGAnimatedString = js.native
  
  /* standard dom */
  val kernelMatrix: org.scalajs.dom.SVGAnimatedNumberList = js.native
  
  /* standard dom */
  val kernelUnitLengthX: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard dom */
  val kernelUnitLengthY: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard dom */
  val orderX: org.scalajs.dom.SVGAnimatedInteger = js.native
  
  /* standard dom */
  val orderY: org.scalajs.dom.SVGAnimatedInteger = js.native
  
  /* standard dom */
  val preserveAlpha: org.scalajs.dom.SVGAnimatedBoolean = js.native
  
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
  
  /* standard dom */
  val targetX: org.scalajs.dom.SVGAnimatedInteger = js.native
  
  /* standard dom */
  val targetY: org.scalajs.dom.SVGAnimatedInteger = js.native
}
