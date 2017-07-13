## Control Flows

There is not big changes in this topic respective with Java or other languages.
  
Here what *Kotlin* give us as new:

* **If expression**
 
We don't need to use ternaries anymore because the `if` expression returns a value.

```kotlin

    val value = if (high > 0) high else low

```

* **When expression**

Here what it's really new, Kotlin has replaced the operator `switch` with a new one called `when` with extra powers.

`when` matches its argument against all the branches provided until some of conditions is satisfied sequentially, if not 
you must specify a `else` condition.
 
 > If the compiler detect that the expression could be not satisfied, it won't compile until you specify a `else` condition. 

Also it has two operators to specify deeper what are the conditions:
* `is` / `!is` check if the value is or not from a particular type. 
* `in` / `!in` check if the values is in a range.
 
Here some examples of what we can do:
 ```kotlin

// Example with constants
fun main(args: Array<String>) {
  val value = 1
  when (value) {
          0, 1 -> println("low value")
          2, 5 -> println("high value")
          else -> println("unknown value")
      }
}

//  Example using when with sealed class
fun execute(value: Int, operation: Operation) = when(operation) {
    is Operation.Decrement -> value - operation.value
    is Operation.Increment -> value + operation.value
}

sealed class Operation {
    class Increment(val value: Int) : Operation()
    class Decrement(val value: Int) : Operation()
}

// Example using in operator. 
val y = when(value) {
    in 0..1 -> false
    in 2..6 -> true
    else -> false
}
```

> Tips: We can use `when` expresion without arguments to apply all the checks that we would like to have

```kotlin
val randomString = "Jose Luis"
    val x = when {
        high == 5 -> true
        high > low -> false
        randomString is String -> true
        randomString.isEmpty() -> true
        else -> false
    }
```