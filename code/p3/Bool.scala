object Bool {
  def main(args: Array[String]) {
    println("Depending on the boolean within the list there will be different")
    println("outputs. Have a look!")

    val bools = Seq(true, false)
    for (bool <- bools) {
      bool match {
        case false => println("tails, son!")
        case true => println("heads, baby!")
      }
    }
  }
}
