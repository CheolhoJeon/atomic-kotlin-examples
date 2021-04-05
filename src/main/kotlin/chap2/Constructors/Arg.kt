package chap2.Constructors

// Constructors/Arg.kt

class Alien(name: String) {
  val greeting = "Poor $name!"
}

fun main() {
  val alien = Alien("Mr. Meeseeks")
  println(alien.greeting)
  // alien.name // Eorror // [1]
}
/* Output:
Poor Mr. Meeseeks!
*/