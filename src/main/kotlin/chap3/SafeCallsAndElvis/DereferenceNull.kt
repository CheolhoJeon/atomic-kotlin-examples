package chap3.SafeCallsAndElvis

fun main() {
  val s: String? = null
  // Doesn't compile:
  // s.length         // [1]
}