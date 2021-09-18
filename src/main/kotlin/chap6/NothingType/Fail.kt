package chap6.NothingType

import atomictest.capture

fun fail(i: Int): Nothing =
    throw Exception("fail($i)")

fun main() {
    capture {
        fail(1)
    } eq "Exception: fail(1)"
    capture {
        fail(2)
    } eq "Exception: fail(2)"
}