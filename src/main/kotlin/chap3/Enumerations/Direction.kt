package chap3.Enumerations

import atomictest.eq
import chap3.Enumerations.Direction.*

enum class Direction(val notation: String) {
  North("N"), South("S"),
  East("E"), West("W"); // Semicolon required
  val opposite: Direction
    get() = when (this) {
      North -> South
      South -> North
      West -> East
      East -> West
    }
}

fun main() {
  North.notation eq "N"
  North.opposite eq South
  West.opposite eq East
  North.opposite.notation eq "S"
}