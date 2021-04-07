package chap3.DataClasses

import atomictest.*

class Person(name: String)

data class Contact(
  val name: String,
  val number: String
)

fun main() {
  // These seem the same, bu they're not:
  Person("Cleo") neq Person("Cleo")
  // A data class defines equality sensibly:
  Contact("Miffy", "1-234-567890") eq
      Contact("Miffy", "1-234-567890")
}
/* Sample output:
dataclasses.Person@54bedef2
Contact(name=Miffy, number=1-234-567890)
*/