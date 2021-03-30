package chap1.Functions

fun multiplyByTwo(x: Int): Int {  // [1]
  println("Inside multiplyByTwo") // [2]
  return x * 2
}

fun main() {
  val r = multiplyByTwo(5)
  println(r)
}
/* Output:
Inside multiplyByTwo
10
*/