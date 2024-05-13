package typings.std.global

import org.scalajs.dom.GamepadMappingType
import typings.std.DOMHighResTimeStamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Gamepad")
@js.native
/* standard dom */
open class Gamepad ()
  extends StObject
     with typings.std.Gamepad {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/axes) */
  /* standard dom */
  /* CompleteClass */
  override val axes: js.Array[Double] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/buttons) */
  /* standard dom */
  /* CompleteClass */
  override val buttons: js.Array[org.scalajs.dom.GamepadButton] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/connected) */
  /* standard dom */
  /* CompleteClass */
  override val connected: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/id) */
  /* standard dom */
  /* CompleteClass */
  override val id: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/index) */
  /* standard dom */
  /* CompleteClass */
  override val index: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/mapping) */
  /* standard dom */
  /* CompleteClass */
  override val mapping: GamepadMappingType = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/timestamp) */
  /* standard dom */
  /* CompleteClass */
  override val timestamp: DOMHighResTimeStamp = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val vibrationActuator: typings.std.GamepadHapticActuator | Null = js.native
}
