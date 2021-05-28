package chap5.Abstract.multipleinheritance2

interface Animal
interface Mammal: Animal
interface AquaticAnimal: Animal

class Dophin : Mammal, AquaticAnimal