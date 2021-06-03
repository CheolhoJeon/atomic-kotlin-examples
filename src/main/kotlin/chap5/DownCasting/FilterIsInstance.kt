package chap5.DownCasting

import atomictest.eq

fun main() {
  val humans1: List<Creature> =
    group.filter { it is Human }
  humans1.size eq 2
  val human2: List<Human> =
    group.filterIsInstance<Human>()
  human2 eq humans1
}