package chap5.Object.objectshare2

import atomictest.eq
import chap5.Object.objectshare1.f
import chap5.Object.objectsharing.Shared

fun g() {
  Shared.i += 7
}

fun main() {
  f()
  g()
  Shared.i eq 12
}

