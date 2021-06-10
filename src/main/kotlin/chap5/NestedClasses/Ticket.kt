package chap5.NestedClasses

import chap5.NestedClasses.Ticket.Seat.*

class Ticket(
  val name: String,
  val seat: Seat = Coach
) {
  enum class Seat {
    Coach,
    Premium,
    Business,
    First
  }
  fun upgrade(): Ticket {
    val newSeat = values() [
        (seat.ordinal + 1)
          .coerceAtMost(First.ordinal)
    ]
    return Ticket(name, newSeat)
  }
  fun meal() = when(seat) {
    Coach -> "Bag Meal"
    Premium -> "Bag Meal with Cookie"
    Business -> "Het Meal"
    First -> "Private Chef"
  }
  override fun toString() = "$seat"
}