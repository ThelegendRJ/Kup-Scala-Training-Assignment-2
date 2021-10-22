import org.scalatest.flatspec.AnyFlatSpec
class FactorialTailRecursionTest extends AnyFlatSpec {
  val obj =new FactorialTailRecursion
  "condition" should "be valid as 3 will return 6" in {
    assert(39916800==obj.factorial(3))
  }
  "condition" should "be invalid as 4 will return 24" in {
    assert(39916800!=obj.factorial(4))
  }
}