package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebTransportOptions extends StObject {
  
  /* standard dom */
  var allowPooling: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var congestionControl: js.UndefOr[WebTransportCongestionControl] = js.undefined
  
  /* standard dom */
  var requireUnreliable: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var serverCertificateHashes: js.UndefOr[js.Array[WebTransportHash]] = js.undefined
}
object WebTransportOptions {
  
  inline def apply(): WebTransportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebTransportOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebTransportOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowPooling(value: scala.Boolean): Self = StObject.set(x, "allowPooling", value.asInstanceOf[js.Any])
    
    inline def setAllowPoolingUndefined: Self = StObject.set(x, "allowPooling", js.undefined)
    
    inline def setCongestionControl(value: WebTransportCongestionControl): Self = StObject.set(x, "congestionControl", value.asInstanceOf[js.Any])
    
    inline def setCongestionControlUndefined: Self = StObject.set(x, "congestionControl", js.undefined)
    
    inline def setRequireUnreliable(value: scala.Boolean): Self = StObject.set(x, "requireUnreliable", value.asInstanceOf[js.Any])
    
    inline def setRequireUnreliableUndefined: Self = StObject.set(x, "requireUnreliable", js.undefined)
    
    inline def setServerCertificateHashes(value: js.Array[WebTransportHash]): Self = StObject.set(x, "serverCertificateHashes", value.asInstanceOf[js.Any])
    
    inline def setServerCertificateHashesUndefined: Self = StObject.set(x, "serverCertificateHashes", js.undefined)
    
    inline def setServerCertificateHashesVarargs(value: WebTransportHash*): Self = StObject.set(x, "serverCertificateHashes", js.Array(value*))
  }
}
