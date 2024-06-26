package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry) */
@js.native
trait CustomElementRegistry extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry/define) */
  /* standard dom */
  def define(name: java.lang.String, constructor: CustomElementConstructor): Unit = js.native
  def define(name: java.lang.String, constructor: CustomElementConstructor, options: ElementDefinitionOptions): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry/get) */
  /* standard dom */
  def get(name: java.lang.String): js.UndefOr[CustomElementConstructor] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry/getName) */
  /* standard dom */
  def getName(constructor: CustomElementConstructor): java.lang.String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry/upgrade) */
  /* standard dom */
  def upgrade(root: org.scalajs.dom.Node): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry/whenDefined) */
  /* standard dom */
  def whenDefined(name: java.lang.String): js.Promise[CustomElementConstructor] = js.native
}
