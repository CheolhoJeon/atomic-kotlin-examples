package chap7.LateInitialization

import atomictest.eq

class Suitcase : Bag {
    private var items: String? = null
    override fun setUp() {
        items = "socks, jacket, laptop"
    }
    fun checkSocks(): Boolean =
        items?.contains("socks") ?: false
}

fun main() {
    val suitcase = Suitcase()
    suitcase.setUp()
    suitcase.checkSocks() eq true
}