package edu.knoldus

class FactorialTailRecursion {
  class FactorialTailRecursion {
    def factorial(num: Int): BigInt = {
      @tailrec 
      def fact(num: Int, accum: Int): Int = {
        num match {
          case 0 => accum                          
          case _ => fact(num - 1, num * accum)     
        }
      }
      fact(num, 1)
    }
  }
}
