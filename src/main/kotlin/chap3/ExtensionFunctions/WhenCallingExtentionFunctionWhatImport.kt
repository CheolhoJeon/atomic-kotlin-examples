package chap3.ExtensionFunctions.theOther

import atomictest.eq
import chap3.ExtensionFunctions.Book
// Own Class에 Extension Function 기능을 활용하면 가독성이 좋아지지만,
// 외부 패지키지에서 사용하는 경우 추가적인 import 문이 필요함
import chap3.ExtensionFunctions.categorize

// Own Example by cheolho
fun main() {
  Book("Dracula").categorize("Vampire") eq
      """title: "Dracula", category: Vampire"""
}

