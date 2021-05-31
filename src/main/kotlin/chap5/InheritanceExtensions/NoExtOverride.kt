package chap5.InheritanceExtensions

import atomictest.trace

open class Base {
  open fun f() = "Base.f()"
}

class Derived : Base() {
  override fun f() = "Derived.f()"
}

fun Base.g() = "Base.g()"
fun Derived.g() = "Derived.f()"

fun useBase(b: Base) {
  trace("Received ${b::class.simpleName}")
  trace(b.f())
  trace(b.g())
}

fun main() {
  useBase(Base())
  useBase(Derived())
  trace eq """
    Received Base
    Base.f()
    Base.g()
    Received Derived
    Derived.f()
    Base.g()
  """
}