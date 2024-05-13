package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console) */
@js.native
trait Console extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/assert_static) */
  /* standard dom */
  def assert(condition: scala.Boolean, data: Any*): Unit = js.native
  def assert(condition: Unit, data: Any*): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/clear_static) */
  /* standard dom */
  def clear(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/count_static) */
  /* standard dom */
  def count(): Unit = js.native
  def count(label: java.lang.String): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/countReset_static) */
  /* standard dom */
  def countReset(): Unit = js.native
  def countReset(label: java.lang.String): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/debug_static) */
  /* standard dom */
  def debug(data: Any*): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/dir_static) */
  /* standard dom */
  def dir(): Unit = js.native
  def dir(item: Any): Unit = js.native
  def dir(item: Any, options: Any): Unit = js.native
  def dir(item: Unit, options: Any): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/dirxml_static) */
  /* standard dom */
  def dirxml(data: Any*): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/error_static) */
  /* standard dom */
  def error(data: Any*): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/group_static) */
  /* standard dom */
  def group(data: Any*): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/groupCollapsed_static) */
  /* standard dom */
  def groupCollapsed(data: Any*): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/groupEnd_static) */
  /* standard dom */
  def groupEnd(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/info_static) */
  /* standard dom */
  def info(data: Any*): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/log_static) */
  /* standard dom */
  def log(data: Any*): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/table_static) */
  /* standard dom */
  def table(): Unit = js.native
  def table(tabularData: Any): Unit = js.native
  def table(tabularData: Any, properties: js.Array[java.lang.String]): Unit = js.native
  def table(tabularData: Unit, properties: js.Array[java.lang.String]): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/time_static) */
  /* standard dom */
  def time(): Unit = js.native
  def time(label: java.lang.String): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/timeEnd_static) */
  /* standard dom */
  def timeEnd(): Unit = js.native
  def timeEnd(label: java.lang.String): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/timeLog_static) */
  /* standard dom */
  def timeLog(label: java.lang.String, data: Any*): Unit = js.native
  def timeLog(label: Unit, data: Any*): Unit = js.native
  
  /* standard dom */
  def timeStamp(): Unit = js.native
  def timeStamp(label: java.lang.String): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/trace_static) */
  /* standard dom */
  def trace(data: Any*): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/warn_static) */
  /* standard dom */
  def warn(data: Any*): Unit = js.native
}
