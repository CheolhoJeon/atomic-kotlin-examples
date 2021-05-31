package chap5.InheritanceExtensions.composeAdapter

import atomictest.trace
import chap5.InheritanceExtensions.*

class MyClass {
  fun g() = trace("g()")
  fun h() = trace("h()")
}

fun useMyClass(mc: MyClass) {
  mc.g()
  mc.h()
}

class MyClassAdaptedForLib : LibType {
  val field = MyClass()
  override fun f1() = field.h()
  override fun f2() = field.g()
}

fun main() {
  val mc = MyClassAdaptedForLib()
  utility1(mc)
  utility2(mc)
  useMyClass(mc.field)
  trace eq "h() g() g() h() g() h()"
}