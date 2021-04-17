package chap3.ExtensionProperties

import atomictest.eq

val String.indices: IntRange
  get() = 0 until length

fun main() {
  "abc".indices eq 0..2
}
