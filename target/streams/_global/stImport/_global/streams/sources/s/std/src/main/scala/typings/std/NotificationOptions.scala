package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationOptions extends StObject {
  
  /* standard dom */
  var badge: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var body: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var data: js.UndefOr[Any] = js.undefined
  
  /* standard dom */
  var dir: js.UndefOr[NotificationDirection] = js.undefined
  
  /* standard dom */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var lang: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var requireInteraction: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var silent: js.UndefOr[scala.Boolean | Null] = js.undefined
  
  /* standard dom */
  var tag: js.UndefOr[java.lang.String] = js.undefined
}
object NotificationOptions {
  
  inline def apply(): NotificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotificationOptions] (val x: Self) extends AnyVal {
    
    inline def setBadge(value: java.lang.String): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    inline def setBody(value: java.lang.String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDir(value: NotificationDirection): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setIcon(value: java.lang.String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLang(value: java.lang.String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setRequireInteraction(value: scala.Boolean): Self = StObject.set(x, "requireInteraction", value.asInstanceOf[js.Any])
    
    inline def setRequireInteractionUndefined: Self = StObject.set(x, "requireInteraction", js.undefined)
    
    inline def setSilent(value: scala.Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentNull: Self = StObject.set(x, "silent", null)
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    inline def setTag(value: java.lang.String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
