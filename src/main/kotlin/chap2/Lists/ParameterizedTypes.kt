package chap2.Lists

// List/ParameterizedTypes.kt
import atomictest.eq

fun main() {
  // Type is inferred:
  val numbers = listOf(1, 2, 3)
  val strings = listOf("one", "two", "three")

  // Exactly the same, but explicitly typed:
  val number2: List<Int> = listOf(1, 2, 3)
  val strings2: List<String> = listOf("one", "two", "three")

  numbers eq number2
  strings eq strings2
}