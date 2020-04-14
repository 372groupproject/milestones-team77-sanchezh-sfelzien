object Short{
  def main(args: Array[String]): Unit = {
    println("1234456789 + 1234565463 = ")
    val x = 1234456789 + 1234565463
    val y = x.toShort
    println("regular int: " + x)
    println("now a short: " +y)
  }
}
