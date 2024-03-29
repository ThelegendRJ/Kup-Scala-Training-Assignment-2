package edu.knoldus

class FactorialRecursion {
  def factorial(num: Int): Int = {
    num match {
      case 0 => 1
      case _ => num * factorial(num - 1)
    }
  }
}

