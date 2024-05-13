package typings.std

import typings.std.stdInts.`0`
import typings.std.stdInts.`1`
import typings.std.stdInts.`2`
import typings.std.stdInts.`3`
import typings.std.stdInts.`4`
import typings.std.stdInts.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A base interface used by the component transfer function interfaces.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGComponentTransferFunctionElement)
  */
@js.native
trait SVGComponentTransferFunctionElement
  extends StObject
     with SVGElement {
  
  /* standard dom */
  val SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE: `3` = js.native
  
  /* standard dom */
  val SVG_FECOMPONENTTRANSFER_TYPE_GAMMA: `5` = js.native
  
  /* standard dom */
  val SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY: `1` = js.native
  
  /* standard dom */
  val SVG_FECOMPONENTTRANSFER_TYPE_LINEAR: `4` = js.native
  
  /* standard dom */
  val SVG_FECOMPONENTTRANSFER_TYPE_TABLE: `2` = js.native
  
  /* standard dom */
  val SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN: `0` = js.native
  
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
  val amplitude: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard dom */
  val exponent: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard dom */
  val intercept: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard dom */
  val offset: org.scalajs.dom.SVGAnimatedNumber = js.native
  
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
  val slope: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard dom */
  val tableValues: org.scalajs.dom.SVGAnimatedNumberList = js.native
  
  /* standard dom */
  val `type`: org.scalajs.dom.SVGAnimatedEnumeration = js.native
}
