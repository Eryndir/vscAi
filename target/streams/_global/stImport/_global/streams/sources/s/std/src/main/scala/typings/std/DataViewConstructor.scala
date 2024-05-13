package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.std.anon.BYTESPERELEMENT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataViewConstructor
  extends StObject
     with /* standard es5 */
Instantiable1[/* buffer */ js.typedarray.ArrayBuffer & BYTESPERELEMENT, js.typedarray.DataView]
     with Instantiable2[
      /* buffer */ js.typedarray.ArrayBuffer & BYTESPERELEMENT, 
      /* byteOffset */ Double, 
      js.typedarray.DataView
    ]
     with Instantiable3[
      /* buffer */ js.typedarray.ArrayBuffer & BYTESPERELEMENT, 
      (/* byteOffset */ Double) | (/* byteOffset */ Unit), 
      /* byteLength */ Double, 
      js.typedarray.DataView
    ]
