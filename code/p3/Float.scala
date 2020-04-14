object Float{
  def main(args: Array[String]): Unit = {
    println("111/23 = ")
    val y = 111f/23
    val x = 111/23
    println("Notice that we added 'f' to the end of the dividend, giving us the float: " +y)
    println("Otherwise we get the approximation in integer form: " + x)
  }
}
