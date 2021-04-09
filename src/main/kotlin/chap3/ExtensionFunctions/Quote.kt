package chap3.ExtensionFunctions.other

import atomictest.eq
import chap3.ExtensionFunctions.extensionfunctions.doubleQuote
import chap3.ExtensionFunctions.extensionfunctions.singleQuote

fun main() {
  "Single".singleQuote() eq "'Single'"
  "Double".doubleQuote() eq "\"Double\""
}