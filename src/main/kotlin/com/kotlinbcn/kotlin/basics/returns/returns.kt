package com.kotlinbcn.kotlin.basics.returns


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