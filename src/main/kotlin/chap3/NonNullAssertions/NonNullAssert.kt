package chap3.NonNullAssertions

import atomictest.capture
import atomictest.eq

fun main() {
  var x: String? = "abc"
  x!! eq "abc"
  x = null
  capture {
    val s: String = x!!
  } eq "NullPointerException"
}
