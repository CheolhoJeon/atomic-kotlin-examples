package chap4.ImportanceOfLambdas

import atomictest.eq

fun main() {
  val list = listOf(1, 2, 3, 4)
  val even = list.filter { it % 2 == 0 }
  val greeterThan2 = list.filter { it > 2 }
  even eq listOf(2, 4)
  greeterThan2 eq listOf(3, 4)
}
