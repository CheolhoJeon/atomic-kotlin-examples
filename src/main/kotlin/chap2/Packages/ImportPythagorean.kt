package chap2.Packages

// Packages/ImportPythagorean.kt
import chap2.Packages.pythagorean.RightTriangle

fun main() {
  val rt = RightTriangle(3.0, 4.0)
  println(rt.hypotenuse())
  println(rt.area())
}
/* Output:
5.0
6.0
*/