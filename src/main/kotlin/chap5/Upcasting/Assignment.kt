package chap5.Upcasting

fun main() {
  val shape1: Shape = Square()
  val shape2: Shape = Triangle()
  // Doesn't compile:
  // shape1.color()
  // shape2.rotate()
}