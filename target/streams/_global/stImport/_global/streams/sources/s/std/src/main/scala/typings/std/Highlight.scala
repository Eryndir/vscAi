package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Highlight) */
@js.native
trait Highlight
  extends StObject
     with Set[AbstractRange] {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Highlight/priority) */
  /* standard dom */
  var priority: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Highlight/type) */
  /* standard dom */
  var `type`: HighlightType = js.native
}
