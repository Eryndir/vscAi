package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A MutationRecord represents an individual DOM mutation. It is the object that is passed to MutationObserver's callback.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord)
  */
trait MutationRecord extends StObject {
  
  /**
    * Return the nodes added and removed respectively.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/addedNodes)
    */
  /* standard dom */
  val addedNodes: org.scalajs.dom.NodeList[org.scalajs.dom.Node]
  
  /**
    * Returns the local name of the changed attribute, and null otherwise.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/attributeName)
    */
  /* standard dom */
  val attributeName: java.lang.String | Null
  
  /**
    * Returns the namespace of the changed attribute, and null otherwise.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/attributeNamespace)
    */
  /* standard dom */
  val attributeNamespace: java.lang.String | Null
  
  /**
    * Return the previous and next sibling respectively of the added or removed nodes, and null otherwise.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/nextSibling)
    */
  /* standard dom */
  val nextSibling: org.scalajs.dom.Node | Null
  
  /**
    * The return value depends on type. For "attributes", it is the value of the changed attribute before the change. For "characterData", it is the data of the changed node before the change. For "childList", it is null.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/oldValue)
    */
  /* standard dom */
  val oldValue: java.lang.String | Null
  
  /**
    * Return the previous and next sibling respectively of the added or removed nodes, and null otherwise.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/previousSibling)
    */
  /* standard dom */
  val previousSibling: org.scalajs.dom.Node | Null
  
  /**
    * Return the nodes added and removed respectively.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/removedNodes)
    */
  /* standard dom */
  val removedNodes: org.scalajs.dom.NodeList[org.scalajs.dom.Node]
  
  /**
    * Returns the node the mutation affected, depending on the type. For "attributes", it is the element whose attribute changed. For "characterData", it is the CharacterData node. For "childList", it is the node whose children changed.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/target)
    */
  /* standard dom */
  val target: org.scalajs.dom.Node
  
  /**
    * Returns "attributes" if it was an attribute mutation. "characterData" if it was a mutation to a CharacterData node. And "childList" if it was a mutation to the tree of nodes.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/type)
    */
  /* standard dom */
  val `type`: MutationRecordType
}
object MutationRecord {
  
  inline def apply(
    addedNodes: org.scalajs.dom.NodeList[org.scalajs.dom.Node],
    removedNodes: org.scalajs.dom.NodeList[org.scalajs.dom.Node],
    target: org.scalajs.dom.Node,
    `type`: MutationRecordType
  ): MutationRecord = {
    val __obj = js.Dynamic.literal(addedNodes = addedNodes.asInstanceOf[js.Any], removedNodes = removedNodes.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], attributeName = null, attributeNamespace = null, nextSibling = null, oldValue = null, previousSibling = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MutationRecord] (val x: Self) extends AnyVal {
    
    inline def setAddedNodes(value: org.scalajs.dom.NodeList[org.scalajs.dom.Node]): Self = StObject.set(x, "addedNodes", value.asInstanceOf[js.Any])
    
    inline def setAttributeName(value: java.lang.String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
    
    inline def setAttributeNameNull: Self = StObject.set(x, "attributeName", null)
    
    inline def setAttributeNamespace(value: java.lang.String): Self = StObject.set(x, "attributeNamespace", value.asInstanceOf[js.Any])
    
    inline def setAttributeNamespaceNull: Self = StObject.set(x, "attributeNamespace", null)
    
    inline def setNextSibling(value: org.scalajs.dom.Node): Self = StObject.set(x, "nextSibling", value.asInstanceOf[js.Any])
    
    inline def setNextSiblingNull: Self = StObject.set(x, "nextSibling", null)
    
    inline def setOldValue(value: java.lang.String): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueNull: Self = StObject.set(x, "oldValue", null)
    
    inline def setPreviousSibling(value: org.scalajs.dom.Node): Self = StObject.set(x, "previousSibling", value.asInstanceOf[js.Any])
    
    inline def setPreviousSiblingNull: Self = StObject.set(x, "previousSibling", null)
    
    inline def setRemovedNodes(value: org.scalajs.dom.NodeList[org.scalajs.dom.Node]): Self = StObject.set(x, "removedNodes", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: org.scalajs.dom.Node): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: MutationRecordType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
