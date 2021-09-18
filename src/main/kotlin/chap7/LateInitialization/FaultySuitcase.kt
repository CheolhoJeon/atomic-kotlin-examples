package chap7.LateInitialization

import atomictest.capture

class FaultySuitcase : Bag {
    lateinit var items: String
    override fun setUp() { }
    fun checkSocks() = "socks" in items
}

fun main() {
    val suitcase = FaultySuitcase()
    suitcase.setUp()
    capture {
        suitcase.checkSocks()
    } eq
        "UninitializedPropertyAccessException" +
        ": lateinit property items " +
        "has not been initialized"
}