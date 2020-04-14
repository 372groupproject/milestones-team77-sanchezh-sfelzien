object IntError{
  def main(args: Array[String]): Unit = {
    println("We started with an array of ints (1,2,3,4,5) and have applied multiplication rules")
    println("to get a different output...")
    println("new array:")
    val intArr = Array[Int](1,2,3,4,5)
    for(x <- intArr){
      if (x % 2 == 0){
        intArr.update(x-1, x*20345477372)
      }
      println(intArr(x-1))
    }
  }
}


