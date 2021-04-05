package chap2.Lists

// Lists/MultipleListRefs.kt
import atomictest.eq

fun main() {
  val first = mutableListOf(1)
  val second: List<Int> = first
  second eq listOf(1)

  first += 2
  second eq listOf(1, 2)
}