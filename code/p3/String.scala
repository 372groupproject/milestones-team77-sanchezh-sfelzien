object String{
  def main(args: Array[String]): Unit = {
    println("We started with the array 'wow, 'this', 'incredible', 'device'")
    println("We have since used several substring manipulations and concatenations to create entirely new strings!")
    val y = Array[String]("wow", "this", "incredible", "device")
    println("lets see what this array contains now!")
    for(x <- y){
      println((x.substring(3) + "foobar").concat(x.substring(2)))
    }
  }
}
