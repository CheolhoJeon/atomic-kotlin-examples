package chap3.NullableExtensions

import atomictest.eq

fun String?.isNullOrEmpty(): Boolean =
  this == null || isEmpty()

fun main() {
  "".isNullOrEmpty() eq true

  // My own code for test
  // Nullable에 대한 Extension function이어도 non-nullable 타입에서 사용할 수 있음:
  val s: String = ""
  s.isNullOrEmpty() eq true
}
