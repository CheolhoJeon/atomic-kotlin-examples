package chap5.Abstract

open class Animal
open class Mammal: Animal()
open class AquaticAnimal : Animal()

// More than one base class doesn't compile:
//class Dolphin : Mammal(), AquaticAnimal()