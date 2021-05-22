package chap5.Interfaces

fun interface ZeroArg {
  fun f(): Int
}

fun interface OneArg {
  fun g(n: Int): Int
}

fun interface TwoArg {
  fun h(i: Int, j: Int): Int
}