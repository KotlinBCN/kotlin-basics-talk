## Properties

Properties are variables that hold values (var or val):

```kotlin
class Address {
  val name = "Test"
  var street: String = "Piruleta"
  var city: String  = "Barcelona"
  var zip: Int = 1234
    private set
  var country: String = "SPAIN"
    get() = field.toLowerCase()
    set(value) { field = value.toUpperCase() }

  val isZipEmpty: Boolean
    get() = this.zip == 0

  lateinit var subject: String
}
```

Properties can be delegated also to be backed by another class or entity, this is very useful for creating different schemes where the value 
doesn't have to be defined initially.

```kotlin
class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }
 
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name} in $thisRef.'")
    }
}

class Address {
    var direction: String by Delegate()
}
```

For delegates to work you have to declare two methos which are getValue and setValue.

Useful delegates to know:

  * Lazy - Not initialized until first access
 
```kotlin
  
val lazyValue: String by lazy {
    println("computed!")
    "Hello"
}  
```

Subsequent calls to lazyValue will return "Hello directly", by default that lambda is just executed only one for calculating initially the value.


And:

   * Map - Fields backed by a Map object
   
```kotlin
   
class User(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int     by map
}

val user = User(mapOf(
    "name" to "John Doe",
    "age"  to 25
))

```