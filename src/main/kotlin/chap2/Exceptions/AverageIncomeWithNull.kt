package chap2.Exceptions.withnull

// Exceptions/AverageIncomeWithNull.kt
import atomictest.eq

fun averageIncome(income: Int, months: Int) =
  if (months == 0)
    null
  else
    income / months

fun main() {
  averageIncome(5000, 0) eq null
  averageIncome(3300, 3) eq 1100
}