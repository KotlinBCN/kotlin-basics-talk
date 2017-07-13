## Functions

* Can be declared in:
    * A Kotlin file
    * A class (Member functions)
    * A function (Local functions)
    
```kotlin
fun functionTopLevelFile(): Boolean = true

class Foo {

    // member function
    fun calculate(a: Int, b: Int): Int {

        // local function
        fun sum(a: Int, b: Int): Int = a + b

        // local function
        fun multiply(a: Int, b: Int): Int = a * b

        return when {
            a > b -> sum(a, b)
            else -> multiply(a, b)
        }
    }
}
```

* If the return type is `Unit` we can omit the return type in the funtion definition

```kotlin
fun function() = print("unit return type")
```

* Default values in arguments can be defined using the keyword `=`
 
 ```kotlin
 fun sum(a: Int = 1, b: Int = 1) = a + b
 fun multiply(a: Int = 1, b: Int) = a + b
 
 fun main(args: Array<String>) {
     sum() // 2
     sum(a = 2) // 3
     multiply(b = 2) // 2
 }
```

* We can use `infix` notations when:
    * They are members functions or extension functions
    * They have a single parameter

```kotlin
class Counter {
    infix fun count (value: Array<Int>): Int = value.size   
}

val counter = Counter()
fun counter(values: Array<Int>): Int = counter count values
```

#### Inline Functions

Kotlin has the `inline` keyword and it does is to generate bytecode at the location of the function call
without jumping.
 
Improve the performance (as doesn't need to do a virtual jump) and the method count.
  
Example not using `inline`:

**Kotlin**
```kotlin
fun foo() { /** do something */ }

fun main(args: Array<String>) { foo() }
```

**Pseudo-bytecode**
```
main:
    jump foo

....

foo:
    // do something
    return
```

Example using `inline`:

**Kotlin**
```kotlin
inline fun foo() { /** do something */ }

fun main(args: Array<String>) { foo() }
```

**Pseudo-bytecode**
```text
main:
    foo
```

