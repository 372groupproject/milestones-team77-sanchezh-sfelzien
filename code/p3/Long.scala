object Long{
  def main(args: Array[String]): Unit = {
    println("1234456789 * 1234565463 = ")
    val y = 123456789*123456789L
    println("Notice that we added 'L' to the end of the multiplication, giving us: " +y)
    println("Otherwise we get a 'number too large error'")
  }
}
