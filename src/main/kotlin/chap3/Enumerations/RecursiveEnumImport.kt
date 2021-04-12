package chap3.Enumerations

import atomictest.eq
import chap3.Enumerations.Size.*                          // [1]

enum class Size {
  Tiny, Small, Medium, Large, Huge, Gigantic
}

fun main() {
  Gigantic eq "Gigantic"                                  // [2]
  Size.values().toList() eq                               // [3]
      listOf(Tiny, Small, Medium, Large, Huge, Gigantic)
  Tiny.ordinal eq 0
  Huge.ordinal eq 4
}