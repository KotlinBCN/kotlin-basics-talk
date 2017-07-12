## Returns and Jumps

Are the same as most of the languages:
* **return** nearest enclosing function or anonymous function. 
* **break** terminates the nearest enclosing loop. 
* **continue** proceeds to the next step of the nearest enclosing loop. 

An extra feature that *Kotlin* bring us is that we can **label** any expression to qualify it and specify it.
    
```kotlin
fun main(args: Array<String>) {
    val values = arrayOf(1, 3, 4)

    values.forEach {
        if (it == 3) return@forEach

        if (it == 0) {
            var secundaryValues = arrayOf(10, 20, 30)

            secundaryValues.forEach secundaryValues@ { if (it == 30) return@secundaryValues }
        }
    }
}
```