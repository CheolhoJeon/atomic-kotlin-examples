package chap5.Inheritance

import atomictest.eq

open class GreatApe {
  val weight = 100.0
  val age = 12
}

open class Bonobo: GreatApe()
class Chimpanzee : GreatApe()
class BonoboB : Bonobo()

fun GreatApe.info() = "wt: $weight age: $age"

fun main() {
  GreatApe().info() eq "wt: 100.0 age: 12"
  Bonobo().info() eq "wt: 100.0 age: 12"
  Chimpanzee().info() eq "wt: 100.0 age: 12"
  BonoboB().info() eq "wt: 100.0 age: 12"
}
