package com.kotlinbcn.kotlin.basics.types

import com.sun.xml.internal.fastinfoset.util.StringArray

val double: Double = 0.0 // 64 bit
val doubleNullable: Double? = 0.0
val float: Float = 0.0f // 32 bit
val long: Long = 0 // 64 bit
val int: Int = 0 // 32 bit
val short: Short = 0 // 16 bit
val byte: Byte = 0 // 8


fun main(args: Array<String>) {
    val toByte = double.toByte()
    var toShort = double.toShort()
    var toInt = double.toInt()
    var toLong = double.toLong()
    var toFloat = double.toFloat()
    var toDouble = double.toDouble()
    var toChar = double.toChar()
}

fun arrays() {
    val arrayOf: Array<Int> = arrayOf(1, 2, 3)
    val arrayOfNulls = arrayOfNulls<Int>(3)

    val i = arrayOf[1] // result = 1
    val iNull = arrayOfNulls[1] // result = null

    val arrayFactory = Array(5, { it + 1 }) // result = [1, 2, 3, 4, 5]
}

fun specializedArrays() {
    val shortArrayOf: ShortArray = shortArrayOf(1, 2)
    val intArrayOf: IntArray = intArrayOf(1, 2)
    // etc...
}

