object Any{
  def main(args: Array[String]): Unit = {
   println("This is an array of type Any, and thus can hold anything as you will see...")
   var arr = Array[Any]("abc",123, '1', "456")
   arr.foreach{println}
}
}
