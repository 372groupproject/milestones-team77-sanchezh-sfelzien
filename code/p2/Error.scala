package p2

object Error {
  def main(args: Array[String]) {

    toInt("Ham Sandwhich") match {
      case Some(i) => println(i)
      case None => println("That didn't work.")
    }
    def toInt(s: String): Option[Int] = {
      try {
        Some(Integer.parseInt(s.trim))
      } catch {
        case e: Exception => None
      }
    }
  }
}