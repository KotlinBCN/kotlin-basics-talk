package com.kotlinbcn.kotlin.java_interop

class PrinterKotlin {
    fun print(value: String) = println(value)

    fun print(f: () -> String) = println(f())
}

fun main(args: Array<String>) {
    val printerJava = PrinterJava()

    printerJava.print("Jose Luis Franconetti")
    printerJava.print { "Jose" }
}