package chap4.LocalFunctions

import atomictest.eq

fun main() {
  fun String.exclaim() = "$this!"
  "Hello".exclaim() eq "Hello!"
  "Hello".exclaim() eq "Hello!"
  "Bonjour".exclaim() eq "Bonjour!"
  "Ciao".exclaim() eq "Ciao!"
}