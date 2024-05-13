package typings.std

import typings.std.stdStrings.byob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    /* standard es2015.symbol.wellknown */
    @JSName(js.Symbol.replace)
    var replace: js.Function2[
        /* string */ java.lang.String, 
        /* replacer */ js.Function2[/* substring */ java.lang.String, /* repeated */ Any, java.lang.String], 
        java.lang.String
      ] = js.native
  }
  
  trait AcceptNode extends StObject {
    
    /* standard dom */
    def acceptNode(node: org.scalajs.dom.Node): Double
  }
  object AcceptNode {
    
    inline def apply(acceptNode: org.scalajs.dom.Node => Double): AcceptNode = {
      val __obj = js.Dynamic.literal(acceptNode = js.Any.fromFunction1(acceptNode))
      __obj.asInstanceOf[AcceptNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AcceptNode] (val x: Self) extends AnyVal {
      
      inline def setAcceptNode(value: org.scalajs.dom.Node => Double): Self = StObject.set(x, "acceptNode", js.Any.fromFunction1(value))
    }
  }
  
  trait BYTESPERELEMENT extends StObject {
    
    /* standard es5 */
    var BYTES_PER_ELEMENT: js.UndefOr[scala.Nothing] = js.undefined
  }
  
  trait Get[This, Value /* <: js.ThisFunction1[/* this */ This, /* args */ Any, Any] */] extends StObject {
    
    /**
      * Gets the current value of the method from the provided object.
      *
      * @example
      * let fn = context.access.get(instance);
      */
    /* standard decorators */
    def get(`object`: This): Value
    
    /**
      * Determines whether an object has a property with the same name as the decorated element.
      */
    /* standard decorators */
    def has(`object`: This): scala.Boolean
  }
  object Get {
    
    inline def apply[This, Value /* <: js.ThisFunction1[/* this */ This, /* args */ Any, Any] */](get: This => Value, has: This => scala.Boolean): Get[This, Value] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has))
      __obj.asInstanceOf[Get[This, Value]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Get[?, ?], This, Value /* <: js.ThisFunction1[/* this */ This, /* args */ Any, Any] */] (val x: Self & (Get[This, Value])) extends AnyVal {
      
      inline def setGet(value: This => Value): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHas(value: This => scala.Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    }
  }
  
  trait GetHas[This, Value] extends StObject {
    
    /**
      * Gets the value of the field on the provided object.
      */
    /* standard decorators */
    def get(`object`: This): Value
    
    /**
      * Determines whether an object has a property with the same name as the decorated element.
      */
    /* standard decorators */
    def has(`object`: This): scala.Boolean
    
    /**
      * Sets the value of the field on the provided object.
      */
    /* standard decorators */
    def set(`object`: This, value: Value): Unit
  }
  object GetHas {
    
    inline def apply[This, Value](get: This => Value, has: This => scala.Boolean, set: (This, Value) => Unit): GetHas[This, Value] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[GetHas[This, Value]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetHas[?, ?], This, Value] (val x: Self & (GetHas[This, Value])) extends AnyVal {
      
      inline def setGet(value: This => Value): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHas(value: This => scala.Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setSet(value: (This, Value) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  trait Has[This, Value] extends StObject {
    
    /**
      * Invokes the getter on the provided object.
      *
      * @example
      * let value = context.access.get(instance);
      */
    /* standard decorators */
    def get(`object`: This): Value
    
    /**
      * Determines whether an object has a property with the same name as the decorated element.
      */
    /* standard decorators */
    def has(`object`: This): scala.Boolean
  }
  object Has {
    
    inline def apply[This, Value](get: This => Value, has: This => scala.Boolean): Has[This, Value] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has))
      __obj.asInstanceOf[Has[This, Value]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Has[?, ?], This, Value] (val x: Self & (Has[This, Value])) extends AnyVal {
      
      inline def setGet(value: This => Value): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHas(value: This => scala.Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    }
  }
  
  trait HighWaterMark extends StObject {
    
    /* standard dom */
    var highWaterMark: js.UndefOr[Double] = js.undefined
  }
  object HighWaterMark {
    
    inline def apply(): HighWaterMark = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HighWaterMark]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HighWaterMark] (val x: Self) extends AnyVal {
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
    }
  }
  
  trait Item[T] extends StObject {
    
    /* standard scripthost */
    def Item(index: Any): T
  }
  object Item {
    
    inline def apply[T](Item: Any => T): Item[T] = {
      val __obj = js.Dynamic.literal(Item = js.Any.fromFunction1(Item))
      __obj.asInstanceOf[Item[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Item[?], T] (val x: Self & Item[T]) extends AnyVal {
      
      inline def setItem(value: Any => T): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    }
  }
  
  trait Length extends StObject {
    
    /* standard scripthost */
    def Item(n: Double): java.lang.String
    
    /* standard scripthost */
    var length: Double
  }
  object Length {
    
    inline def apply(Item: Double => java.lang.String, length: Double): Length = {
      val __obj = js.Dynamic.literal(Item = js.Any.fromFunction1(Item), length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Length]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Length] (val x: Self) extends AnyVal {
      
      inline def setItem(value: Double => java.lang.String): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LookupNamespaceURI extends StObject {
    
    /* standard dom */
    def lookupNamespaceURI(): java.lang.String | Null = js.native
    def lookupNamespaceURI(prefix: java.lang.String): java.lang.String | Null = js.native
  }
  
  @js.native
  trait Match extends StObject {
    
    /* standard es2015.symbol.wellknown */
    @JSName(js.Symbol.`match`)
    var `match`: js.Function1[/* string */ java.lang.String, RegExpMatchArray | Null] = js.native
  }
  
  trait Mode extends StObject {
    
    /* standard dom */
    var mode: byob
  }
  object Mode {
    
    inline def apply(): Mode = {
      val __obj = js.Dynamic.literal(mode = "byob")
      __obj.asInstanceOf[Mode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Mode] (val x: Self) extends AnyVal {
      
      inline def setMode(value: byob): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Proxy[T /* <: js.Object */] extends StObject {
    
    /* standard es2015.proxy */
    var proxy: T
    
    /* standard es2015.proxy */
    def revoke(): Unit
  }
  object Proxy {
    
    inline def apply[T /* <: js.Object */](proxy: T, revoke: () => Unit): Proxy[T] = {
      val __obj = js.Dynamic.literal(proxy = proxy.asInstanceOf[js.Any], revoke = js.Any.fromFunction0(revoke))
      __obj.asInstanceOf[Proxy[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Proxy[?], T /* <: js.Object */] (val x: Self & Proxy[T]) extends AnyVal {
      
      inline def setProxy(value: T): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setRevoke(value: () => Unit): Self = StObject.set(x, "revoke", js.Any.fromFunction0(value))
    }
  }
  
  trait Raw extends StObject {
    
    /* standard es2015.core */
    var raw: js.Array[java.lang.String] | ArrayLike[java.lang.String]
  }
  object Raw {
    
    inline def apply(raw: js.Array[java.lang.String] | ArrayLike[java.lang.String]): Raw = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[Raw]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Raw] (val x: Self) extends AnyVal {
      
      inline def setRaw(value: js.Array[java.lang.String] | ArrayLike[java.lang.String]): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawVarargs(value: java.lang.String*): Self = StObject.set(x, "raw", js.Array(value*))
    }
  }
  
  @js.native
  trait Replace extends StObject {
    
    /* standard es2015.symbol.wellknown */
    @JSName(js.Symbol.replace)
    var replace: js.Function2[/* string */ java.lang.String, /* replaceValue */ java.lang.String, java.lang.String] = js.native
  }
  
  @js.native
  trait Search extends StObject {
    
    /* standard es2015.symbol.wellknown */
    @JSName(js.Symbol.search)
    var search: js.Function1[/* string */ java.lang.String, Double] = js.native
  }
  
  trait Set[This, Value] extends StObject {
    
    /**
      * Determines whether an object has a property with the same name as the decorated element.
      */
    /* standard decorators */
    def has(`object`: This): scala.Boolean
    
    /**
      * Invokes the setter on the provided object.
      *
      * @example
      * context.access.set(instance, value);
      */
    /* standard decorators */
    def set(`object`: This, value: Value): Unit
  }
  object Set {
    
    inline def apply[This, Value](has: This => scala.Boolean, set: (This, Value) => Unit): typings.std.anon.Set[This, Value] = {
      val __obj = js.Dynamic.literal(has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[typings.std.anon.Set[This, Value]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.std.anon.Set[?, ?], This, Value] (val x: Self & (typings.std.anon.Set[This, Value])) extends AnyVal {
      
      inline def setHas(value: This => scala.Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setSet(value: (This, Value) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Split extends StObject {
    
    /* standard es2015.symbol.wellknown */
    @JSName(js.Symbol.split)
    var split: js.Function2[
        /* string */ java.lang.String, 
        /* limit */ js.UndefOr[Double], 
        js.Array[java.lang.String]
      ] = js.native
  }
}
