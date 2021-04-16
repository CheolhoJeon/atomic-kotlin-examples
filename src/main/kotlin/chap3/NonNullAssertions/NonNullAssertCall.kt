package chap3.NonNullAssertions

import atomictest.eq

fun main() {
  val s: String? = "abc"
  s!!.length eq 3
}
