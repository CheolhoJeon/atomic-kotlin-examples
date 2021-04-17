package chap3.ExtensionProperties

import atomictest.eq

fun main() {
  val list: List<*> = listOf(1, 2)
  val any: Any? = list[0]
  any eq 1
}
