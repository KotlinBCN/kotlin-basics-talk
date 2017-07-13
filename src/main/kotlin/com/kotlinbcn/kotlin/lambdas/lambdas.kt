package com.kotlinbcn.kotlin.lambdas

fun random() = Math.random()

fun double(e: Double) = e * e

fun <T> compose(g: () -> T, f: (T) -> T): () -> T {
  return { f(g()) }
}

fun main(args: Array<String>) {
  val randomDoubleFun: () -> Double = compose(::random, ::double)

  println("Random double function: ${randomDoubleFun()}")
}