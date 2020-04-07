package p2

object Match {
  def main(args: Array[String]) {
    println(matchFunc(1));
    println(matchFunc(2));
    println(matchFunc(3));
    
    def matchFunc(x: Int): String = x match {
      case 1 => "Uno"
      case 2 => "Dos"
      case _ => "No se"
    }
  }
}