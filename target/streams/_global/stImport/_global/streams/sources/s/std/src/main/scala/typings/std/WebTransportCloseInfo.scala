package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebTransportCloseInfo extends StObject {
  
  /* standard dom */
  var closeCode: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var reason: js.UndefOr[java.lang.String] = js.undefined
}
object WebTransportCloseInfo {
  
  inline def apply(): WebTransportCloseInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebTransportCloseInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebTransportCloseInfo] (val x: Self) extends AnyVal {
    
    inline def setCloseCode(value: Double): Self = StObject.set(x, "closeCode", value.asInstanceOf[js.Any])
    
    inline def setCloseCodeUndefined: Self = StObject.set(x, "closeCode", js.undefined)
    
    inline def setReason(value: java.lang.String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
