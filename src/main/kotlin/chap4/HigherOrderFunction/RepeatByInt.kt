package chap4.HigherOrderFunction

import atomictest.trace

fun main() {
  repeat(4) { trace("hi") }
  trace eq "hi! hi! hi! hi!"
}
