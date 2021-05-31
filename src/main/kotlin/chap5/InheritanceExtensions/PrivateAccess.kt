package chap5.InheritanceExtensions

class Z(var i: Int = 0) {
  private var j = 0
  fun increment() {
    i++
    j++
  }
}

fun Z.decrement() {
  i--
  // j-- // Cannot access
}