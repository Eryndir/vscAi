package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CSSStyleRule represents a single CSS style rule. It implements the CSSRule interface with a type value of 1 (CSSRule.STYLE_RULE).
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleRule)
  */
@js.native
trait CSSStyleRule
  extends StObject
     with CSSGroupingRule {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleRule/selectorText) */
  /* standard dom */
  var selectorText: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleRule/style) */
  /* standard dom */
  val style: org.scalajs.dom.CSSStyleDeclaration = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleRule/styleMap) */
  /* standard dom */
  val styleMap: StylePropertyMap = js.native
}
