package com.kotlinbcn.kotlin.coroutines

import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

fun main(args: Array<String>) {

  runBlocking {
    val jobs = List(100_000) {
      launch(CommonPool) {
        println("I'm sleeping $it ...")
        delay(1000L)
        print(".")
      }
    }

    jobs.forEach { it.join() }
  }
}