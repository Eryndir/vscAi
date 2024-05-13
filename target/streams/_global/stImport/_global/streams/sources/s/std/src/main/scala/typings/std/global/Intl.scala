package typings.std.global

import typings.std.Intl.Collator
import typings.std.Intl.CollatorConstructor
import typings.std.Intl.CollatorOptions
import typings.std.Intl.DateTimeFormat
import typings.std.Intl.DateTimeFormatConstructor
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormat
import typings.std.Intl.NumberFormatConstructor
import typings.std.Intl.NumberFormatOptions
import typings.std.Intl.ResolvedCollatorOptions
import typings.std.Intl.ResolvedNumberFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/////////////////////////////
/// ECMAScript Internationalization API
/////////////////////////////
object Intl {
  
  @JSGlobal("Intl")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("Intl.Collator")
  @js.native
  def Collator: CollatorConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.Collator")
  @js.native
  /* standard es5 */
  open class CollatorCls ()
    extends StObject
       with Collator {
    def this(locales: java.lang.String) = this()
    def this(locales: js.Array[java.lang.String]) = this()
    def this(locales: java.lang.String, options: CollatorOptions) = this()
    def this(locales: js.Array[java.lang.String], options: CollatorOptions) = this()
    def this(locales: Unit, options: CollatorOptions) = this()
    
    /* standard es5 */
    /* CompleteClass */
    override def compare(x: java.lang.String, y: java.lang.String): Double = js.native
    
    /* standard es5 */
    /* CompleteClass */
    override def resolvedOptions(): ResolvedCollatorOptions = js.native
  }
  
  inline def Collator_=(x: CollatorConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Collator")(x.asInstanceOf[js.Any])
  
  @JSGlobal("Intl.DateTimeFormat")
  @js.native
  def DateTimeFormat: DateTimeFormatConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.DateTimeFormat")
  @js.native
  /* standard es5 */
  open class DateTimeFormatCls ()
    extends StObject
       with DateTimeFormat {
    def this(locales: java.lang.String) = this()
    def this(locales: js.Array[java.lang.String]) = this()
    def this(locales: java.lang.String, options: DateTimeFormatOptions) = this()
    def this(locales: js.Array[java.lang.String], options: DateTimeFormatOptions) = this()
    def this(locales: Unit, options: DateTimeFormatOptions) = this()
  }
  
  inline def DateTimeFormat_=(x: DateTimeFormatConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DateTimeFormat")(x.asInstanceOf[js.Any])
  
  @JSGlobal("Intl.NumberFormat")
  @js.native
  def NumberFormat: NumberFormatConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.NumberFormat")
  @js.native
  /* standard es5 */
  open class NumberFormatCls ()
    extends StObject
       with NumberFormat {
    def this(locales: java.lang.String) = this()
    def this(locales: js.Array[java.lang.String]) = this()
    def this(locales: java.lang.String, options: NumberFormatOptions) = this()
    def this(locales: js.Array[java.lang.String], options: NumberFormatOptions) = this()
    def this(locales: Unit, options: NumberFormatOptions) = this()
    
    /* standard es5 */
    /* CompleteClass */
    override def format(value: Double): java.lang.String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    override def resolvedOptions(): ResolvedNumberFormatOptions = js.native
  }
  
  inline def NumberFormat_=(x: NumberFormatConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NumberFormat")(x.asInstanceOf[js.Any])
}
