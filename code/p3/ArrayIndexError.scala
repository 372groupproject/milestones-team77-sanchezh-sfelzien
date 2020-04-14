object Char{
  def main(args: Array[String]): Unit = {
    println("We started with the array '97, 98, 99, 100, 101', and have cast these ints to chars.")
    val y = Array[Char](97.asInstanceOf[Char],98.asInstanceOf[Char],99.asInstanceOf[Char],100.asInstanceOf[Char],101.asInstanceOf[Char])
    println("lets see what this array contains now!")
    for(x <- y){
      println(y(30))
    }
  }
}
