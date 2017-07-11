package com.kotlinbcn.kotlin.classes.interfaces

interface Clock {
  val time: Int get() = 24

  fun tick()
}

class RealClock : Clock {
  override fun tick() {

  }
}

fun main(args: Array<String>) {
}