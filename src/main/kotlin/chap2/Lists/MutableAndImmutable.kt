package chap2.Lists

import atomictest.eq

fun main() {
  val immutableList: List<Int> = listOf(1, 2)
  val mutableList: MutableList<Int> = mutableListOf(1, 2)

  // This code occur error:
  // Compiler tell us 'Val cannot be reassigned'
  // It means '+=' operator create new object
  // If you change val to var below code can be operated
//  immutableList += 3

  mutableList += 3
  mutableList eq "[1, 2, 3]"
}