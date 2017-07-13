package com.kotlinbcn.kotlin.basics.functions

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

    // function omitting the return type as it's Unit
    fun function() = print("unit return type")
}

// Default parameters
fun sum(a: Int = 1, b: Int = 1) = a + b
fun multiply(a: Int = 1, b: Int) = a + b

fun main(args: Array<String>) {
    sum() // 2
    sum(a = 2) // 3
    multiply(b = 2) // 2
}

// Infix notations

class Counter {
    infix fun count (value: Array<Int>): Int = value.size
}

val counter = Counter()
fun counter(values: Array<Int>): Int = counter count values

