package chap5.Composition

interface Building
interface Kitchen

interface House: Building {
  val kitchen: Kitchen
}