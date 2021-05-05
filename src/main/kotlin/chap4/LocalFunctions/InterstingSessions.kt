package chap4.LocalFunctions

import atomictest.eq

fun main() {
  sessions.any(
    fun(session: Session): Boolean { // [1]
      if (session.title.contains("Kotlin") &&
        session.speaker in favoriteSpeakers) {
        return true
      }
      // ... more checks
      return false
    }) eq true
}