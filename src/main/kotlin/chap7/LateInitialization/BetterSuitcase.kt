package chap7.LateInitialization

import atomictest.eq

class BetterSuitcase : Bag {
    lateinit var items: String
    override fun setUp() {
        items = "socks, jacket, laptop"
    }
    fun checkSocks() = "socks" in items
}

fun main() {
    val suitcase = BetterSuitcase()
    suitcase.setUp()
    suitcase.checkSocks() eq true
}