package chap3.Overloading

import atomictest.eq

class My {
  fun foo() = 0
}

fun My.foo() = 1            // [1]

// It can't be executed:
// override fun My.foo() = 1            // Own Code by Cheolho

fun My.foo(i: Int) = i + 2  // [2]

fun main() {
  My().foo() eq 0
  My().foo(1) eq 3
}