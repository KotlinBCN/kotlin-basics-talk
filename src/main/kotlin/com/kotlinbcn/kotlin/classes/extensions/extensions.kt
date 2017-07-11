package com.kotlinbcn.kotlin.classes.extensions

class Velociraptor {
  fun grunt() { println("Groarrrrrrrr") }
}

fun Velociraptor.gruntMore() {
  grunt()
  grunt()
  grunt()
}

fun main(args: Array<String>) {
  val velociraptor = Velociraptor()
  velociraptor.gruntMore()
}

