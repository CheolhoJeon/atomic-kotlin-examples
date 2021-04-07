package chap3.NamedDefaultArgs

class DefaultArg

fun h(d: DefaultArg = DefaultArg()) = println(d)

fun main() {
  h()
  h()
}