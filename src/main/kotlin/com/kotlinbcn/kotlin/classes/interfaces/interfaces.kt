package com.kotlinbcn.kotlin.classes.interfaces

interface Clock {
  val time: Int get() = 24

  fun tick() {
    println("Tick")
  }
}

class RealClock : Clock {
}

fun main(args: Array<String>) {
  RealClock().tick()
}