## Functional Programming

Kotlin is not a pure functional programming language but it doesn't mean that you can not develop in kotlin in a functional way.
  
You just need to keep in mind the following concepts:
  * Immutability
  * No side effects
  
  
```kotlin
// No side effects
fun sum(a: Int, b: Int) = a + b

// Inmutable
fun <T> append(a: T, b: List<T>): List<T> {
    val toMutableList = b.toMutableList()
    toMutableList.add(a)
    return toMutableList.toList()
} 
```

##### Mapping, filtering, reducing etc

```kotlin
val nums = listOf(1, 2, 3, 4)

val r = nums.map { it * 2 }.sum()       // r == 20

// .flatmap{}
// .reduce{}
// etc..
```

##### Algebraic data types

Kotlin doesn't contains algebraic data types like (Optiona, Either, Try, etc...) but they are libraries that implement
this data types. 

* [funKTionale](https://github.com/MarioAriasC/funKTionale/wiki)
* [kategory](https://github.com/kategory/kategory)


Example