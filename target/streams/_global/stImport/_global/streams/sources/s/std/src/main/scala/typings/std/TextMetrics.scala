package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The dimensions of a piece of text in the canvas, as created by the CanvasRenderingContext2D.measureText() method.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics)
  */
trait TextMetrics extends StObject {
  
  /**
    * Returns the measurement described below.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/actualBoundingBoxAscent)
    */
  /* standard dom */
  val actualBoundingBoxAscent: Double
  
  /**
    * Returns the measurement described below.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/actualBoundingBoxDescent)
    */
  /* standard dom */
  val actualBoundingBoxDescent: Double
  
  /**
    * Returns the measurement described below.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/actualBoundingBoxLeft)
    */
  /* standard dom */
  val actualBoundingBoxLeft: Double
  
  /**
    * Returns the measurement described below.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/actualBoundingBoxRight)
    */
  /* standard dom */
  val actualBoundingBoxRight: Double
  
  /**
    * Returns the measurement described below.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/alphabeticBaseline)
    */
  /* standard dom */
  val alphabeticBaseline: Double
  
  /**
    * Returns the measurement described below.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/emHeightAscent)
    */
  /* standard dom */
  val emHeightAscent: Double
  
  /**
    * Returns the measurement described below.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/emHeightDescent)
    */
  /* standard dom */
  val emHeightDescent: Double
  
  /**
    * Returns the measurement described below.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/fontBoundingBoxAscent)
    */
  /* standard dom */
  val fontBoundingBoxAscent: Double
  
  /**
    * Returns the measurement described below.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/fontBoundingBoxDescent)
    */
  /* standard dom */
  val fontBoundingBoxDescent: Double
  
  /**
    * Returns the measurement described below.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/hangingBaseline)
    */
  /* standard dom */
  val hangingBaseline: Double
  
  /**
    * Returns the measurement described below.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/ideographicBaseline)
    */
  /* standard dom */
  val ideographicBaseline: Double
  
  /**
    * Returns the measurement described below.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/width)
    */
  /* standard dom */
  val width: Double
}
object TextMetrics {
  
  inline def apply(
    actualBoundingBoxAscent: Double,
    actualBoundingBoxDescent: Double,
    actualBoundingBoxLeft: Double,
    actualBoundingBoxRight: Double,
    alphabeticBaseline: Double,
    emHeightAscent: Double,
    emHeightDescent: Double,
    fontBoundingBoxAscent: Double,
    fontBoundingBoxDescent: Double,
    hangingBaseline: Double,
    ideographicBaseline: Double,
    width: Double
  ): TextMetrics = {
    val __obj = js.Dynamic.literal(actualBoundingBoxAscent = actualBoundingBoxAscent.asInstanceOf[js.Any], actualBoundingBoxDescent = actualBoundingBoxDescent.asInstanceOf[js.Any], actualBoundingBoxLeft = actualBoundingBoxLeft.asInstanceOf[js.Any], actualBoundingBoxRight = actualBoundingBoxRight.asInstanceOf[js.Any], alphabeticBaseline = alphabeticBaseline.asInstanceOf[js.Any], emHeightAscent = emHeightAscent.asInstanceOf[js.Any], emHeightDescent = emHeightDescent.asInstanceOf[js.Any], fontBoundingBoxAscent = fontBoundingBoxAscent.asInstanceOf[js.Any], fontBoundingBoxDescent = fontBoundingBoxDescent.asInstanceOf[js.Any], hangingBaseline = hangingBaseline.asInstanceOf[js.Any], ideographicBaseline = ideographicBaseline.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextMetrics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextMetrics] (val x: Self) extends AnyVal {
    
    inline def setActualBoundingBoxAscent(value: Double): Self = StObject.set(x, "actualBoundingBoxAscent", value.asInstanceOf[js.Any])
    
    inline def setActualBoundingBoxDescent(value: Double): Self = StObject.set(x, "actualBoundingBoxDescent", value.asInstanceOf[js.Any])
    
    inline def setActualBoundingBoxLeft(value: Double): Self = StObject.set(x, "actualBoundingBoxLeft", value.asInstanceOf[js.Any])
    
    inline def setActualBoundingBoxRight(value: Double): Self = StObject.set(x, "actualBoundingBoxRight", value.asInstanceOf[js.Any])
    
    inline def setAlphabeticBaseline(value: Double): Self = StObject.set(x, "alphabeticBaseline", value.asInstanceOf[js.Any])
    
    inline def setEmHeightAscent(value: Double): Self = StObject.set(x, "emHeightAscent", value.asInstanceOf[js.Any])
    
    inline def setEmHeightDescent(value: Double): Self = StObject.set(x, "emHeightDescent", value.asInstanceOf[js.Any])
    
    inline def setFontBoundingBoxAscent(value: Double): Self = StObject.set(x, "fontBoundingBoxAscent", value.asInstanceOf[js.Any])
    
    inline def setFontBoundingBoxDescent(value: Double): Self = StObject.set(x, "fontBoundingBoxDescent", value.asInstanceOf[js.Any])
    
    inline def setHangingBaseline(value: Double): Self = StObject.set(x, "hangingBaseline", value.asInstanceOf[js.Any])
    
    inline def setIdeographicBaseline(value: Double): Self = StObject.set(x, "ideographicBaseline", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
