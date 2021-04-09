package chap3.ExtensionFunctions

import atomictest.eq

class Book(var title: String)

fun Book.categorize(category: String) =
  """title: "$title", category: $category"""

// Own code by cheolho
// Extension function에서 프로퍼티의 값을 수정할 수 도있음
fun Book.setter(newTitle: String) {
  title = newTitle
}

fun main() {
  Book("Dracula").categorize("Vampire") eq
      """title: "Dracula", category: Vampire"""
}