package chap3.ExtensionProperties

import atomictest.eq

val List<*>.indices: IntRange
  get() = 0 until size

fun main() {
  listOf(1).indices eq 0..0
  listOf('a', 'b', 'c', 'd').indices eq 0..3
  emptyList<Int>().indices eq IntRange.EMPTY
}
