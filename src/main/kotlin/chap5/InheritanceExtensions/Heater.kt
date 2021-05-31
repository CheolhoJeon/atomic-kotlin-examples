package chap5.InheritanceExtensions

import atomictest.eq

open class Heater {
  fun heat(temperature: Int) =
    "heating to $temperature"
}

fun warm(heater: Heater) {
  heater.heat(70) eq "heating to 70"
}