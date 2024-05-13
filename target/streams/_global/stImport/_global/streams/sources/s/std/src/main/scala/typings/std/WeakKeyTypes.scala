package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stores types to be used with WeakSet, WeakMap, WeakRef, and FinalizationRegistry
  */
trait WeakKeyTypes extends StObject {
  
  /* standard es5 */
  var `object`: js.Object
}
object WeakKeyTypes {
  
  inline def apply(`object`: js.Object): WeakKeyTypes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakKeyTypes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WeakKeyTypes] (val x: Self) extends AnyVal {
    
    inline def setObject(value: js.Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
