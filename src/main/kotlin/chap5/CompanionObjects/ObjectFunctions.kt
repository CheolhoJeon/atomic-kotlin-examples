package chap5.CompanionObjects

import atomictest.eq

class CompanionObjectFunction {
  companion object {
    private var n: Int = 0
    fun increment() = ++n
  }
}

fun main() {
  CompanionObjectFunction.increment() eq 1
  CompanionObjectFunction.increment() eq 2
}