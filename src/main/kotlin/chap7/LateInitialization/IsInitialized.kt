package chap7.LateInitialization

import atomictest.trace

class WithLate {
    lateinit var x: String
    fun status() = "${::x.isInitialized}"
}

lateinit var y: String

fun main() {
    trace("${::y.isInitialized}")
    y = "Ready"
    trace("${::y.isInitialized}")
    val withLate = WithLate()
    trace(withLate.status())
    withLate.x = "Set"
    trace(withLate.status())
    trace eq "false true false true"
}