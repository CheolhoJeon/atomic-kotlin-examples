package chap5.CompanionObjects

import atomictest.eq

class WithCompanion {
  companion object {
    val i = 3
    fun f() = i * 3
  }
  fun g() = i + f()
}

fun WithCompanion.Companion.h() = f() * i

/**
 * 비교를 위해 내가 별도로 작성한 코드
 */
class WithObject {
  object Nested {
    val i = 3
    fun f() = i * 3
  }
  fun g() = Nested.i + Nested.f()
}

fun WithObject.Nested.h() = f() * i

fun main() {
  val wc = WithCompanion()
  wc.g() eq 12
  WithCompanion.i eq 3
  WithCompanion.f() eq 9
  WithCompanion.h() eq 27

  val wo = WithObject()
  wo.g() eq 12
  WithObject.Nested.i eq 3
  WithObject.Nested.f() eq 9
  WithObject.Nested.h() eq 27
}