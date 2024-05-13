package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/OverconstrainedError) */
trait OverconstrainedError
  extends StObject
     with DOMException {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/OverconstrainedError/constraint) */
  /* standard dom */
  val constraint: java.lang.String
}
object OverconstrainedError {
  
  inline def apply(code: Double, constraint: java.lang.String, message: java.lang.String, name: java.lang.String): OverconstrainedError = {
    val __obj = js.Dynamic.literal(ABORT_ERR = 20, DATA_CLONE_ERR = 25, DOMSTRING_SIZE_ERR = 2, HIERARCHY_REQUEST_ERR = 3, INDEX_SIZE_ERR = 1, INUSE_ATTRIBUTE_ERR = 10, INVALID_ACCESS_ERR = 15, INVALID_CHARACTER_ERR = 5, INVALID_MODIFICATION_ERR = 13, INVALID_NODE_TYPE_ERR = 24, INVALID_STATE_ERR = 11, NAMESPACE_ERR = 14, NETWORK_ERR = 19, NOT_FOUND_ERR = 8, NOT_SUPPORTED_ERR = 9, NO_DATA_ALLOWED_ERR = 6, NO_MODIFICATION_ALLOWED_ERR = 7, QUOTA_EXCEEDED_ERR = 22, SECURITY_ERR = 18, SYNTAX_ERR = 12, TIMEOUT_ERR = 23, TYPE_MISMATCH_ERR = 17, URL_MISMATCH_ERR = 21, VALIDATION_ERR = 16, WRONG_DOCUMENT_ERR = 4, code = code.asInstanceOf[js.Any], constraint = constraint.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverconstrainedError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OverconstrainedError] (val x: Self) extends AnyVal {
    
    inline def setConstraint(value: java.lang.String): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
  }
}
