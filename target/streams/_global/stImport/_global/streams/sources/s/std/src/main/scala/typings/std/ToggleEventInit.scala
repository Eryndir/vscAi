package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToggleEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var newState: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var oldState: js.UndefOr[java.lang.String] = js.undefined
}
object ToggleEventInit {
  
  inline def apply(): ToggleEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToggleEventInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToggleEventInit] (val x: Self) extends AnyVal {
    
    inline def setNewState(value: java.lang.String): Self = StObject.set(x, "newState", value.asInstanceOf[js.Any])
    
    inline def setNewStateUndefined: Self = StObject.set(x, "newState", js.undefined)
    
    inline def setOldState(value: java.lang.String): Self = StObject.set(x, "oldState", value.asInstanceOf[js.Any])
    
    inline def setOldStateUndefined: Self = StObject.set(x, "oldState", js.undefined)
  }
}
