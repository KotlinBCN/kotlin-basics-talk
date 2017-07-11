package com.kotlinbcn.kotlin.basics.null_safety

data class Foo(val id: Int, val name: String?)

fun main(args: Array<String>) {
    val foo = Foo(1, null)

    /** It will throw a NPE if the variable name is null */
    val count = foo.name!!.length

    /** Without !! operator */
    withoutOperator(foo.name).count()
}

fun withoutOperator(name: String?): String {
    if (name == null)
        throw NullPointerException()
    else
        return name
}