package chap4.Sequences

import atomictest.capture
import atomictest.eq

fun main() {
  val items = mutableListOf(
    "first", "second", "third", "XXX", "4th"
  )
  val seq = generateSequence {
    items.removeAt(0).takeIf { it != "XXX" }
  }
  seq.toList() eq "[first, second, third]"
  capture {
    seq.toList()
  } eq "IllegalStateException: This " +
      "sequence can be consumed only once."
}