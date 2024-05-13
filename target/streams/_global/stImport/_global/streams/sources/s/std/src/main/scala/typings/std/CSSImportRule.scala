package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSImportRule) */
trait CSSImportRule
  extends StObject
     with CSSRule {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSImportRule/href) */
  /* standard dom */
  val href: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSImportRule/layerName) */
  /* standard dom */
  val layerName: java.lang.String | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSImportRule/media) */
  /* standard dom */
  val media: org.scalajs.dom.MediaList
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSImportRule/styleSheet) */
  /* standard dom */
  val styleSheet: org.scalajs.dom.CSSStyleSheet | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSImportRule/supportsText) */
  /* standard dom */
  val supportsText: java.lang.String | Null
}
object CSSImportRule {
  
  inline def apply(
    cssText: java.lang.String,
    href: java.lang.String,
    media: org.scalajs.dom.MediaList,
    `type`: Double
  ): CSSImportRule = {
    val __obj = js.Dynamic.literal(CHARSET_RULE = 2, COUNTER_STYLE_RULE = 11, FONT_FACE_RULE = 5, FONT_FEATURE_VALUES_RULE = 14, IMPORT_RULE = 3, KEYFRAMES_RULE = 7, KEYFRAME_RULE = 8, MEDIA_RULE = 4, NAMESPACE_RULE = 10, PAGE_RULE = 6, STYLE_RULE = 1, SUPPORTS_RULE = 12, cssText = cssText.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], layerName = null, parentRule = null, parentStyleSheet = null, styleSheet = null, supportsText = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSImportRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSImportRule] (val x: Self) extends AnyVal {
    
    inline def setHref(value: java.lang.String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setLayerName(value: java.lang.String): Self = StObject.set(x, "layerName", value.asInstanceOf[js.Any])
    
    inline def setLayerNameNull: Self = StObject.set(x, "layerName", null)
    
    inline def setMedia(value: org.scalajs.dom.MediaList): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setStyleSheet(value: org.scalajs.dom.CSSStyleSheet): Self = StObject.set(x, "styleSheet", value.asInstanceOf[js.Any])
    
    inline def setStyleSheetNull: Self = StObject.set(x, "styleSheet", null)
    
    inline def setSupportsText(value: java.lang.String): Self = StObject.set(x, "supportsText", value.asInstanceOf[js.Any])
    
    inline def setSupportsTextNull: Self = StObject.set(x, "supportsText", null)
  }
}
