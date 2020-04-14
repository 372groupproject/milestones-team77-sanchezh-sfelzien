object Byte{
  def main(args: Array[String]): Unit = {
    val byteArr = Array[Byte]('a','b','c')
    println("originally we inserted a,b and c as chars in the array...")
    println("Lets see what we get out when converted to bytes!")
    byteArr.foreach{
      println
    }
  }
}
