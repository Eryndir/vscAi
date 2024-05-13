package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSlotElement) */
@js.native
trait HTMLSlotElement
  extends StObject
     with HTMLElement {
  
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
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSlotElement/assign) */
  /* standard dom */
  def assign(nodes: (org.scalajs.dom.Element | org.scalajs.dom.Text)*): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSlotElement/assignedElements) */
  /* standard dom */
  def assignedElements(): js.Array[org.scalajs.dom.Element] = js.native
  def assignedElements(options: AssignedNodesOptions): js.Array[org.scalajs.dom.Element] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSlotElement/assignedNodes) */
  /* standard dom */
  def assignedNodes(): js.Array[org.scalajs.dom.Node] = js.native
  def assignedNodes(options: AssignedNodesOptions): js.Array[org.scalajs.dom.Node] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSlotElement/name) */
  /* standard dom */
  var name: java.lang.String = js.native
  
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
