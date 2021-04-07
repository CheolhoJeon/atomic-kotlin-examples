package chap3.DataClasses

import atomictest.eq

data class Simple(
  val arg1: String,
  val arg2: Int
)

fun main() {
  val s1 = Simple("Hi", 29)
  val s2 = Simple("Hi", 29)
  s1 eq "Simple(arg1=Hi, arg2=29)"
  s1 eq s2
}