object Double{
  def main(args: Array[String]): Unit = {
    println("111/23 = ")
    val y = 111f/23
    val x = 111/23
    println("Notice that we added 'd' to the end of the dividend, giving us the double: " +y)
    println("Otherwise we get the approximation in integer form: " + x)
    println("by adding marking this type as a double we get precison to the 15th place after the decimal ")
    println("as compared to the float which only does 6 places or so after the decimal.")
  }
}
