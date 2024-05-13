package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGFitToViewBox extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement/preserveAspectRatio) */
  /* standard dom */
  val preserveAspectRatio: org.scalajs.dom.SVGAnimatedPreserveAspectRatio
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement/viewBox) */
  /* standard dom */
  val viewBox: org.scalajs.dom.SVGAnimatedRect
}
object SVGFitToViewBox {
  
  inline def apply(
    preserveAspectRatio: org.scalajs.dom.SVGAnimatedPreserveAspectRatio,
    viewBox: org.scalajs.dom.SVGAnimatedRect
  ): SVGFitToViewBox = {
    val __obj = js.Dynamic.literal(preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGFitToViewBox]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGFitToViewBox] (val x: Self) extends AnyVal {
    
    inline def setPreserveAspectRatio(value: org.scalajs.dom.SVGAnimatedPreserveAspectRatio): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setViewBox(value: org.scalajs.dom.SVGAnimatedRect): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
  }
}
