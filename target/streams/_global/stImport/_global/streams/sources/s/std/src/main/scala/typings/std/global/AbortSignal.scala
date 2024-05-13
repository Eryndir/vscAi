package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("AbortSignal")
@js.native
/* standard dom */
open class AbortSignal ()
  extends StObject
     with typings.std.AbortSignal
object AbortSignal {
  
  @JSGlobal("AbortSignal")
  @js.native
  val ^ : js.Any = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/abort_static) */
  /* standard dom */
  inline def abort(): org.scalajs.dom.AbortSignal = ^.asInstanceOf[js.Dynamic].applyDynamic("abort")().asInstanceOf[org.scalajs.dom.AbortSignal]
  inline def abort(reason: Any): org.scalajs.dom.AbortSignal = ^.asInstanceOf[js.Dynamic].applyDynamic("abort")(reason.asInstanceOf[js.Any]).asInstanceOf[org.scalajs.dom.AbortSignal]
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/timeout_static) */
  /* standard dom */
  inline def timeout(milliseconds: Double): org.scalajs.dom.AbortSignal = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[org.scalajs.dom.AbortSignal]
}
