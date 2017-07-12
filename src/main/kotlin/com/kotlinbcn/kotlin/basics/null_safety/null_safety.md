## Null Safety

* All the types are non-nullable by defaults.
* To define a nullable variable we need to use the keyword **?**

```kotlin
fun main(args: Array<String>) {
 /** Non-nullable */
 val foo: Int = 0
 foo = null // Compile error
 
 /** nullable */
 val bar: Int? = 1 // nullable
  bar = null
}
```

> Did you think that you will end up with **if else** expressions everywhere?

Kotlin includes an **Evil Operator**  through which we can express the typical if else null check with this simple operator “?:”.

```kotlin
fun main(args: Array<String>) {    
    val bar: String? = network()
    
    /** using evil operator */
    val foo: String = bar ?: "Foo"
    
    /** traditional if else */
    if (foo == null) {
        // todo...
    } else {
        // todo...
    }
}
```

- Kotlin provide another operator to simplify the task of throw up a NPE when the variable is null. The operator is **!!** 

```kotlin
data class Foo(val id: Int, val name: String?)

fun main(args: Array<String>) {
    val foo = Foo(1, null)

    /** It will throw a NPE if the variable name is null */
    val count = foo.name!!.length

    /** Without !! operator */
    withoutOperator(foo.name).count()
}

fun withoutOperator(name: String?): String {
    if (name == null)
        throw NullPointerException()
    else
        return name
}
```
 
 