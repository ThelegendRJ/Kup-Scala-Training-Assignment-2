import org.scalatest.flatspec.AnyFlatSpec
class factorialRecursionTest extends AnyFlatSpec {
  "condition" should "be invalid if 11 will return" in {
    val obj = new FactorialRecursion
    assert(!(110==obj.factorial(11)))
  }

  "condition" should "be valid as 0 will return 1" in {
    val obj = new FactorialRecursion
    val temp:Int=obj.factorial(0)
    assert(1==obj.factorial(0))
  }

  "condition" should "be valid as 5 will return 120" in {
    val obj = new FactorialRecursion
    assert(40320==obj.factorial(5))
  }
}
