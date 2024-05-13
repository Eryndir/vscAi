package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextEncoderEncodeIntoResult extends StObject {
  
  /* standard dom */
  var read: Double
  
  /* standard dom */
  var written: Double
}
object TextEncoderEncodeIntoResult {
  
  inline def apply(read: Double, written: Double): TextEncoderEncodeIntoResult = {
    val __obj = js.Dynamic.literal(read = read.asInstanceOf[js.Any], written = written.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEncoderEncodeIntoResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextEncoderEncodeIntoResult] (val x: Self) extends AnyVal {
    
    inline def setRead(value: Double): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setWritten(value: Double): Self = StObject.set(x, "written", value.asInstanceOf[js.Any])
  }
}
