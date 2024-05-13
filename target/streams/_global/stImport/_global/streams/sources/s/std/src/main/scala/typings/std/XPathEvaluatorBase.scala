package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XPathEvaluatorBase extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createExpression) */
  /* standard dom */
  def createExpression(expression: java.lang.String): XPathExpression = js.native
  def createExpression(expression: java.lang.String, resolver: XPathNSResolver): XPathExpression = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createNSResolver) */
  /* standard dom */
  def createNSResolver(nodeResolver: org.scalajs.dom.Node): org.scalajs.dom.Node = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/evaluate) */
  /* standard dom */
  def evaluate(expression: java.lang.String, contextNode: org.scalajs.dom.Node): org.scalajs.dom.XPathResult = js.native
  def evaluate(expression: java.lang.String, contextNode: org.scalajs.dom.Node, resolver: Null, `type`: Double): org.scalajs.dom.XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: org.scalajs.dom.Node,
    resolver: Null,
    `type`: Double,
    result: org.scalajs.dom.XPathResult
  ): org.scalajs.dom.XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: org.scalajs.dom.Node,
    resolver: Null,
    `type`: Unit,
    result: org.scalajs.dom.XPathResult
  ): org.scalajs.dom.XPathResult = js.native
  def evaluate(expression: java.lang.String, contextNode: org.scalajs.dom.Node, resolver: Unit, `type`: Double): org.scalajs.dom.XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: org.scalajs.dom.Node,
    resolver: Unit,
    `type`: Double,
    result: org.scalajs.dom.XPathResult
  ): org.scalajs.dom.XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: org.scalajs.dom.Node,
    resolver: Unit,
    `type`: Unit,
    result: org.scalajs.dom.XPathResult
  ): org.scalajs.dom.XPathResult = js.native
  def evaluate(expression: java.lang.String, contextNode: org.scalajs.dom.Node, resolver: XPathNSResolver): org.scalajs.dom.XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: org.scalajs.dom.Node,
    resolver: XPathNSResolver,
    `type`: Double
  ): org.scalajs.dom.XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: org.scalajs.dom.Node,
    resolver: XPathNSResolver,
    `type`: Double,
    result: org.scalajs.dom.XPathResult
  ): org.scalajs.dom.XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: org.scalajs.dom.Node,
    resolver: XPathNSResolver,
    `type`: Unit,
    result: org.scalajs.dom.XPathResult
  ): org.scalajs.dom.XPathResult = js.native
}
