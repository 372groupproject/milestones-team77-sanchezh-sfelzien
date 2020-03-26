

object HelloWorld {
  def main(args: Array[String]) {
    println("hello world")

    val bools = Seq(true, false)
    for (bool <- bools) {
      bool match {
        case false => println("tails, son!")
        case true => println("heads, baby!")
      }
    }
  }
}
