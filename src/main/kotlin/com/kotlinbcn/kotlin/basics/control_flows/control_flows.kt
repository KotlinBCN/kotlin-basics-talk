package com.kotlinbcn.kotlin.basics.control_flows


fun main(args: Array<String>) {
    val high = 2
    val low = 1

    val value = if (high > 0) high else low

    // simple constants
    when (value) {
        0, 1 -> println("low value")
        2, 5 -> println("high value")
        else -> println("unknown value")
    }

    // using sealed classes
    execute(1, Operation.Decrement(1))

    // not using arguments in the when expression
    val randomString = "Jose Luis"
    val x = when {
        high == 5 -> true
        high > low -> false
        randomString is String -> true
        randomString.isEmpty() -> true
        else -> false
    }

    // Using in operator
    val y = when(value) {
        in 0..1 -> false
        in 2..6 -> true
        else -> false
    }
}

fun isInteger(value: Any): Boolean {
    return value is Int
}

fun execute(value: Int, operation: Operation) = when(operation) {
    is Operation.Decrement -> value - operation.value
    is Operation.Increment -> value + operation.value
}

sealed class Operation {
    class Increment(val value: Int) : Operation()
    class Decrement(val value: Int) : Operation()
}