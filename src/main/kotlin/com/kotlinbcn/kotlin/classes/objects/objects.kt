package com.kotlinbcn.kotlin.classes.objects

interface Factory<out T> {
  fun create(): T
}


class MyClass {
  companion object : Factory<MyClass> {
    override fun create(): MyClass = MyClass()
  }
}

fun main(args: Array<String>) {

}