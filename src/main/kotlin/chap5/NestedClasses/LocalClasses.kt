package chap5.NestedClasses

fun localClasses() {
  open class Amphibian
  class Frog : Amphibian()
  val amphibian: Amphibian = Frog()
}