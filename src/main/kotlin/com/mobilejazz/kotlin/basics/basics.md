# Basics

### Variables

The variables can be:
* **Mutable**: Represented with the keyword **var**
* **Immutable**: Represented with the keyword **val**

> Is the keyword **val** really inmutable?

Nope, just because if we speak of immutability we always need to check if satisfy the two types of immutability:

* **Immutable references:** Once a reference is assigned, it can't be assigned to something else.
* **Immutable values:** // todo...

```kotlin
fun foo() {
    var mutable: Int = 1
    val immutable: Int = 2
    
    mutable = 2 // All OK
    immutable = 3 // Compile error
}
```


