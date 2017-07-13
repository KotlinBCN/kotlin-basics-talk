package com.kotlinbcn.kotlin.classes.properties

class Address {
  val name: String = "Test"
  var street: String = "Piruleta"
  var city: String  = "Barcelona"
  var zip: Int = 1234
    private set
  var country: String = "SPAIN"
    get() = field.toLowerCase()
    set(value) { field = value.toUpperCase() }

  val isZipEmpty: Boolean
    get() = this.zip == 0

  lateinit var subject: String
}

fun main(args: Array<String>) {

}