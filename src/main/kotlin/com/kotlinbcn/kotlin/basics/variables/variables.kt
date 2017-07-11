package com.kotlinbcn.kotlin.basics.variables

fun variables() {
    var mutable: Int = 1 // Mutable variable
    val immutable: Int = 2 // Immutable variable

    val collection = arrayListOf(1, 2, 3) // Immutable reference to a collection
    collection.add(4) // Adding a value to the collection, so we are modifying the values of the immutable collection.

    val immutableList = listOf(1, 2, 3) // Immutable by reference and value
    val mutableList = mutableListOf(1, 2, 3) // Immutable by reference and not value

    var bar: String? = "Bar"

    val foo: String = bar ?: "Foo"
}

fun main(args: Array<String>) {
    variables()
}