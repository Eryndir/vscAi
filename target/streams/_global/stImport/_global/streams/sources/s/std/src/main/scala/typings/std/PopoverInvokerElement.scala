package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopoverInvokerElement extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/popoverTargetAction) */
  /* standard dom */
  var popoverTargetAction: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/popoverTargetElement) */
  /* standard dom */
  var popoverTargetElement: org.scalajs.dom.Element | Null
}
object PopoverInvokerElement {
  
  inline def apply(popoverTargetAction: java.lang.String): PopoverInvokerElement = {
    val __obj = js.Dynamic.literal(popoverTargetAction = popoverTargetAction.asInstanceOf[js.Any], popoverTargetElement = null)
    __obj.asInstanceOf[PopoverInvokerElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopoverInvokerElement] (val x: Self) extends AnyVal {
    
    inline def setPopoverTargetAction(value: java.lang.String): Self = StObject.set(x, "popoverTargetAction", value.asInstanceOf[js.Any])
    
    inline def setPopoverTargetElement(value: org.scalajs.dom.Element): Self = StObject.set(x, "popoverTargetElement", value.asInstanceOf[js.Any])
    
    inline def setPopoverTargetElementNull: Self = StObject.set(x, "popoverTargetElement", null)
  }
}
