package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Selection object represents the range of text selected by the user or the current position of the caret. To obtain a Selection object for examination or modification, call Window.getSelection().
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection)
  */
@js.native
trait Selection extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/addRange) */
  /* standard dom */
  def addRange(range: org.scalajs.dom.Range): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/anchorNode) */
  /* standard dom */
  val anchorNode: org.scalajs.dom.Node | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/anchorOffset) */
  /* standard dom */
  val anchorOffset: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/collapse) */
  /* standard dom */
  def collapse(): Unit = js.native
  def collapse(node: org.scalajs.dom.Node): Unit = js.native
  def collapse(node: org.scalajs.dom.Node, offset: Double): Unit = js.native
  def collapse(node: Null, offset: Double): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/collapseToEnd) */
  /* standard dom */
  def collapseToEnd(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/collapseToStart) */
  /* standard dom */
  def collapseToStart(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/containsNode) */
  /* standard dom */
  def containsNode(node: org.scalajs.dom.Node): scala.Boolean = js.native
  def containsNode(node: org.scalajs.dom.Node, allowPartialContainment: scala.Boolean): scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/deleteFromDocument) */
  /* standard dom */
  def deleteFromDocument(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/removeAllRanges) */
  /* standard dom */
  def empty(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/extend) */
  /* standard dom */
  def extend(node: org.scalajs.dom.Node): Unit = js.native
  def extend(node: org.scalajs.dom.Node, offset: Double): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/focusNode) */
  /* standard dom */
  val focusNode: org.scalajs.dom.Node | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/focusOffset) */
  /* standard dom */
  val focusOffset: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/getRangeAt) */
  /* standard dom */
  def getRangeAt(index: Double): org.scalajs.dom.Range = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/isCollapsed) */
  /* standard dom */
  val isCollapsed: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/modify) */
  /* standard dom */
  def modify(): Unit = js.native
  def modify(alter: java.lang.String): Unit = js.native
  def modify(alter: java.lang.String, direction: java.lang.String): Unit = js.native
  def modify(alter: java.lang.String, direction: java.lang.String, granularity: java.lang.String): Unit = js.native
  def modify(alter: java.lang.String, direction: Unit, granularity: java.lang.String): Unit = js.native
  def modify(alter: Unit, direction: java.lang.String): Unit = js.native
  def modify(alter: Unit, direction: java.lang.String, granularity: java.lang.String): Unit = js.native
  def modify(alter: Unit, direction: Unit, granularity: java.lang.String): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/rangeCount) */
  /* standard dom */
  val rangeCount: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/removeAllRanges) */
  /* standard dom */
  def removeAllRanges(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/removeRange) */
  /* standard dom */
  def removeRange(range: org.scalajs.dom.Range): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/selectAllChildren) */
  /* standard dom */
  def selectAllChildren(node: org.scalajs.dom.Node): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/setBaseAndExtent) */
  /* standard dom */
  def setBaseAndExtent(
    anchorNode: org.scalajs.dom.Node,
    anchorOffset: Double,
    focusNode: org.scalajs.dom.Node,
    focusOffset: Double
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/collapse) */
  /* standard dom */
  def setPosition(): Unit = js.native
  def setPosition(node: org.scalajs.dom.Node): Unit = js.native
  def setPosition(node: org.scalajs.dom.Node, offset: Double): Unit = js.native
  def setPosition(node: Null, offset: Double): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/type) */
  /* standard dom */
  val `type`: java.lang.String = js.native
}
