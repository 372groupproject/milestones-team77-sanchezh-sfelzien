object Nothing{

  def main(args: Array[String]): Unit = {
   println("Nothing is much like null and therefore this will throw and error")
   println("Nothing is moreso like a place holder")
   var arr = Array[Nothing]("abc")
   print(arr(0))
}
}
