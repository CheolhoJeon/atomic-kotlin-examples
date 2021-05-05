package chap4.LocalFunctions

import atomictest.eq

fun main() {
  val list = listOf(1, 2, 3, 4, 5)
  val value = 3
  var result = ""
  list.forEach {
    result += "$it"
    if (it == value) {
      result eq "123"
      return          // [1]
    }
  }
  result eq "Never gets here"
}