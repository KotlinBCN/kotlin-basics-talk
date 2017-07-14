package com.kotlinbcn.kotlin.functional_programming


fun <T> append(a: T, b: List<T>): List<T> {
    val toMutableList = b.toMutableList()
    toMutableList.add(a)
    return toMutableList.toList()
}