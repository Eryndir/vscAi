package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportError)
  */
trait WebTransportError
  extends StObject
     with DOMException {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportError/source) */
  /* standard dom */
  val source: WebTransportErrorSource
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportError/streamErrorCode) */
  /* standard dom */
  val streamErrorCode: Double | Null
}
object WebTransportError {
  
  inline def apply(code: Double, message: java.lang.String, name: java.lang.String, source: WebTransportErrorSource): WebTransportError = {
    val __obj = js.Dynamic.literal(ABORT_ERR = 20, DATA_CLONE_ERR = 25, DOMSTRING_SIZE_ERR = 2, HIERARCHY_REQUEST_ERR = 3, INDEX_SIZE_ERR = 1, INUSE_ATTRIBUTE_ERR = 10, INVALID_ACCESS_ERR = 15, INVALID_CHARACTER_ERR = 5, INVALID_MODIFICATION_ERR = 13, INVALID_NODE_TYPE_ERR = 24, INVALID_STATE_ERR = 11, NAMESPACE_ERR = 14, NETWORK_ERR = 19, NOT_FOUND_ERR = 8, NOT_SUPPORTED_ERR = 9, NO_DATA_ALLOWED_ERR = 6, NO_MODIFICATION_ALLOWED_ERR = 7, QUOTA_EXCEEDED_ERR = 22, SECURITY_ERR = 18, SYNTAX_ERR = 12, TIMEOUT_ERR = 23, TYPE_MISMATCH_ERR = 17, URL_MISMATCH_ERR = 21, VALIDATION_ERR = 16, WRONG_DOCUMENT_ERR = 4, code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], streamErrorCode = null)
    __obj.asInstanceOf[WebTransportError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebTransportError] (val x: Self) extends AnyVal {
    
    inline def setSource(value: WebTransportErrorSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setStreamErrorCode(value: Double): Self = StObject.set(x, "streamErrorCode", value.asInstanceOf[js.Any])
    
    inline def setStreamErrorCodeNull: Self = StObject.set(x, "streamErrorCode", null)
  }
}
