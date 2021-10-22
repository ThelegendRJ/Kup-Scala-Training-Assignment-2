import org.scalatest.flatspec.AnyFlatSpec
class LogTest extends AnyFlatSpec {
  val obj=new Log
  "log" should "be in [level]:message format" in{
    val test :String=obj.log("hello")
    assert(test=="[INFO]:hello")
  }
  "log" should "take level from passing argument" in{
    val test :String=obj.log("hello","RJ")
    assert(test=="[RJ]:hello")
  }
}