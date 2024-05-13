package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasTextDrawingStyles extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/direction) */
  /* standard dom */
  var direction: CanvasDirection
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/font) */
  /* standard dom */
  var font: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fontKerning) */
  /* standard dom */
  var fontKerning: CanvasFontKerning
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fontStretch) */
  /* standard dom */
  var fontStretch: CanvasFontStretch
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fontVariantCaps) */
  /* standard dom */
  var fontVariantCaps: CanvasFontVariantCaps
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/letterSpacing) */
  /* standard dom */
  var letterSpacing: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/textAlign) */
  /* standard dom */
  var textAlign: CanvasTextAlign
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/textBaseline) */
  /* standard dom */
  var textBaseline: CanvasTextBaseline
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/textRendering) */
  /* standard dom */
  var textRendering: CanvasTextRendering
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/wordSpacing) */
  /* standard dom */
  var wordSpacing: java.lang.String
}
object CanvasTextDrawingStyles {
  
  inline def apply(
    direction: CanvasDirection,
    font: java.lang.String,
    fontKerning: CanvasFontKerning,
    fontStretch: CanvasFontStretch,
    fontVariantCaps: CanvasFontVariantCaps,
    letterSpacing: java.lang.String,
    textAlign: CanvasTextAlign,
    textBaseline: CanvasTextBaseline,
    textRendering: CanvasTextRendering,
    wordSpacing: java.lang.String
  ): CanvasTextDrawingStyles = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], fontKerning = fontKerning.asInstanceOf[js.Any], fontStretch = fontStretch.asInstanceOf[js.Any], fontVariantCaps = fontVariantCaps.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any], textBaseline = textBaseline.asInstanceOf[js.Any], textRendering = textRendering.asInstanceOf[js.Any], wordSpacing = wordSpacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasTextDrawingStyles]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanvasTextDrawingStyles] (val x: Self) extends AnyVal {
    
    inline def setDirection(value: CanvasDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setFont(value: java.lang.String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontKerning(value: CanvasFontKerning): Self = StObject.set(x, "fontKerning", value.asInstanceOf[js.Any])
    
    inline def setFontStretch(value: CanvasFontStretch): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
    
    inline def setFontVariantCaps(value: CanvasFontVariantCaps): Self = StObject.set(x, "fontVariantCaps", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: java.lang.String): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setTextAlign(value: CanvasTextAlign): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextBaseline(value: CanvasTextBaseline): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
    
    inline def setTextRendering(value: CanvasTextRendering): Self = StObject.set(x, "textRendering", value.asInstanceOf[js.Any])
    
    inline def setWordSpacing(value: java.lang.String): Self = StObject.set(x, "wordSpacing", value.asInstanceOf[js.Any])
  }
}
