package chap5.Upcasting

import atomictest.trace

fun show(shape: Shape) {
  trace("Show: ${shape.draw()}")
}

fun main() {
  listOf(Circle(), Square(), Triangle())
    .forEach(::show)
  trace eq """
    Show: Circle.draw
    Show: Square.draw
    Show: Triangle.draw
  """
}