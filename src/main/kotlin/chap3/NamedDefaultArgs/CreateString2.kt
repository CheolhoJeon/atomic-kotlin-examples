package chap3.NamedDefaultArgs

import atomictest.eq

fun main() {
  val list = listOf(1, 2, 3)
  list.joinToString(". ", "", "!") eq
      "1. 2. 3!"
  list.joinToString(separator = ". ", prefix = "", postfix = "!")
}