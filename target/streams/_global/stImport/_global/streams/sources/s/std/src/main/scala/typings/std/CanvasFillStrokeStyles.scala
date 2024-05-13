package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasFillStrokeStyles extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createConicGradient) */
  /* standard dom */
  def createConicGradient(startAngle: Double, x: Double, y: Double): org.scalajs.dom.CanvasGradient = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createLinearGradient) */
  /* standard dom */
  def createLinearGradient(x0: Double, y0: Double, x1: Double, y1: Double): org.scalajs.dom.CanvasGradient = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createPattern) */
  /* standard dom */
  def createPattern(image: CanvasImageSource): org.scalajs.dom.CanvasPattern | Null = js.native
  def createPattern(image: CanvasImageSource, repetition: java.lang.String): org.scalajs.dom.CanvasPattern | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createRadialGradient) */
  /* standard dom */
  def createRadialGradient(x0: Double, y0: Double, r0: Double, x1: Double, y1: Double, r1: Double): org.scalajs.dom.CanvasGradient = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fillStyle) */
  /* standard dom */
  var fillStyle: java.lang.String | org.scalajs.dom.CanvasGradient | org.scalajs.dom.CanvasPattern = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/strokeStyle) */
  /* standard dom */
  var strokeStyle: java.lang.String | org.scalajs.dom.CanvasGradient | org.scalajs.dom.CanvasPattern = js.native
}
