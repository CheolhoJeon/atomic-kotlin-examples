package chap4

import atomictest.eq

fun main() {
  val list = listOf('a', 'b', 'c')
  list.mapIndexed { index, _ ->
    "[$index]"
  } eq listOf("[0]", "[1]", "[2]")
}
