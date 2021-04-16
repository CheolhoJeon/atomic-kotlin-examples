package chap3.NullableExtensions

import atomictest.eq

fun isNullOrEmpty(s: String?): Boolean =
  s == null || s.isEmpty()

fun main() {
  isNullOrEmpty(null) eq true
  isNullOrEmpty("") eq true
}
