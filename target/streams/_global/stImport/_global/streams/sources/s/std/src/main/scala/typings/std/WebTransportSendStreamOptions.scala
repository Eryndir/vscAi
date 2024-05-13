package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebTransportSendStreamOptions extends StObject {
  
  /* standard dom */
  var sendOrder: js.UndefOr[Double] = js.undefined
}
object WebTransportSendStreamOptions {
  
  inline def apply(): WebTransportSendStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebTransportSendStreamOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebTransportSendStreamOptions] (val x: Self) extends AnyVal {
    
    inline def setSendOrder(value: Double): Self = StObject.set(x, "sendOrder", value.asInstanceOf[js.Any])
    
    inline def setSendOrderUndefined: Self = StObject.set(x, "sendOrder", js.undefined)
  }
}
