package typings.std

import typings.std.stdInts.`0`
import typings.std.stdInts.`1`
import typings.std.stdInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Corresponds to the <textPath> element.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextPathElement)
  */
@js.native
trait SVGTextPathElement
  extends StObject
     with SVGTextContentElement
     with SVGURIReference {
  
  /* standard dom */
  val TEXTPATH_METHODTYPE_ALIGN: `1` = js.native
  
  /* standard dom */
  val TEXTPATH_METHODTYPE_STRETCH: `2` = js.native
  
  /* standard dom */
  val TEXTPATH_METHODTYPE_UNKNOWN: `0` = js.native
  
  /* standard dom */
  val TEXTPATH_SPACINGTYPE_AUTO: `1` = js.native
  
  /* standard dom */
  val TEXTPATH_SPACINGTYPE_EXACT: `2` = js.native
  
  /* standard dom */
  val TEXTPATH_SPACINGTYPE_UNKNOWN: `0` = js.native
  
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
  val method: org.scalajs.dom.SVGAnimatedEnumeration = js.native
  
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
  val spacing: org.scalajs.dom.SVGAnimatedEnumeration = js.native
  
  /* standard dom */
  val startOffset: org.scalajs.dom.SVGAnimatedLength = js.native
}
