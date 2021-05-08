package chap4.Recursion

import java.lang.IllegalStateException

fun illegalState() {
  throw IllegalStateException()
}

fun fail() = illegalState()

fun main() {
  fail()
}