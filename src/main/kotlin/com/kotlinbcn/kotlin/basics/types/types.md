## Types

* All the types are Object. We can call member functions. 
* Optimized some of the primitive types.
* Types:
    - Numbers
    - Characters (type **Char**)
    - Strings (type **String**)
    - Booleans (type **Boolean**)
    - Arrays

#### Numbers

```kotlin
val double: Double = 0.0 // 64 bit

val float: Float = 0.0f // 32 bit

val long: Long = 0 // 64 bit

val int: Int = 0 // 32 bit

val short: Short = 0 // 16 bit

val byte: Byte = 0 // 8
```

* Numbers are stored as JVM primitive unless we need a nullable reference. 

**Kotlin**
```kotlin
val double: Double = 0.0 // 64 bit
val doubleNullable: Double? = 0.0
```

**Bytecode**
```text
  // access flags 0x1A
  private final static D double = 0.0

  // access flags 0x19
  public final static getDouble()D
   .... 

  // access flags 0x1A
  private final static Ljava/lang/Double; doubleNullable
  @Lorg/jetbrains/annotations/Nullable;() // invisible

  // access flags 0x19
  public final static getDoubleNullable()Ljava/lang/Double;
```

* Supports the following conversions:

```kotlin
val toByte = double.toByte()
var toShort = double.toShort()
var toInt = double.toInt()
var toLong = double.toLong()
var toFloat = double.toFloat()
var toDouble = double.toDouble()
var toChar = double.toChar()
```

> Pro tip: Since kotlin 1.1, we can use underscore to make number constants more readable.

```kotlin
val creditCardNumber = 1234_5678_9012_3456L

val bytes = 0b11010010_01101001_10010100_10010010
```

#### Arrays

* Represented by the Array class and are invariants (We can't assign a Array<Int> to an Array<Any>).
* Contains:
    - `size` property
    - `get` function
    - `set` function

```kotlin
fun arrays() {
    val arrayOf: Array<Int> = arrayOf(1, 2, 3)
    val arrayOfNulls = arrayOfNulls<Int>(3)

    val i = arrayOf[1] // result = 1
    val iNull = arrayOfNulls[1] // result = null

    val arrayFactory = Array(5, { it + 1 }) // result = [1, 2, 3, 4, 5]
}
```

> Tip: Kotlin contains specialized classes to represent arrays of primitive types without boxing overhead:
 
```kotlin
fun specializedArrays() {
    val shortArrayOf: ShortArray = shortArrayOf(1, 2)
    val intArrayOf: IntArray = intArrayOf(1, 2)
    // etc...
}
```