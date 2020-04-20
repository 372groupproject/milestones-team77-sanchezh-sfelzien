package p4

object Function {
  def main(args: Array[String]) {
    var a = 5;
    var b = 6;

    var value = addInt(a, b);
    println(value);

  }

  def addInt(a: Int, b: Int): Int = {
    var sum: Int = 0
    sum = a + b
    return sum
  }
}