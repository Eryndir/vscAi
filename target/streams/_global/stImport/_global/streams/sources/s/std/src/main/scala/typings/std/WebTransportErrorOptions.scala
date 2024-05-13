package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebTransportErrorOptions extends StObject {
  
  /* standard dom */
  var source: js.UndefOr[WebTransportErrorSource] = js.undefined
  
  /* standard dom */
  var streamErrorCode: js.UndefOr[Double | Null] = js.undefined
}
object WebTransportErrorOptions {
  
  inline def apply(): WebTransportErrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebTransportErrorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebTransportErrorOptions] (val x: Self) extends AnyVal {
    
    inline def setSource(value: WebTransportErrorSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setStreamErrorCode(value: Double): Self = StObject.set(x, "streamErrorCode", value.asInstanceOf[js.Any])
    
    inline def setStreamErrorCodeNull: Self = StObject.set(x, "streamErrorCode", null)
    
    inline def setStreamErrorCodeUndefined: Self = StObject.set(x, "streamErrorCode", js.undefined)
  }
}
