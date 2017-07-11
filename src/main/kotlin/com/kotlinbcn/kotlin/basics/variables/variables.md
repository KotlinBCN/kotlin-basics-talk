### Variables

The variables can be:
* **Mutable**: Represented with the keyword **var**
* **Immutable**: Represented with the keyword **val**

> Is the keyword **val** really inmutable?

Nope, just because if we speak of immutability we always need to check if satisfy the two types of immutability:

* **Immutable references:** Once a reference is assigned, it can't be assigned to something else.
* **Immutable values:** The value of the reference cannot be mutated. 

Kotlin doesn't have immutable collections so we can have a immutable reference to a collection but we can modify the
content of the collection, so it's not satisfying all the types. 

```kotlin
fun foo() {
    var mutable: Int = 1
    val immutable: Int = 2
    
    mutable = 2 // All OK
    immutable = 3 // Compile error
    
    val collection = arrayListOf(1, 2, 3) // Immutable reference to a collection
    collection.add(4) // Adding a value to the collection, so we are modifying the values of the immutable collection.
}
```

A really cool thing of Kotlin, it's that it distinguishes between mutable and immutable collections such as lists, sets, 
maps, etc...

```kotlin
fun bar() {
    val immutableList = listOf(1, 2, 3) // Immutable by reference and value
    val mutableList = mutableListOf(1, 2, 3) // Immutable by reference and not value
}
```