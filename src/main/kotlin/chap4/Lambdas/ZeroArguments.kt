package chap4

import atomictest.trace

fun main() {
  run { -> trace("A Lambda") }
  run { trace("Without args") }
  trace eq """
    A Lambda
    Without args
  """
}
