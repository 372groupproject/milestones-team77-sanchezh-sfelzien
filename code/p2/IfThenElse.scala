package p2

object IfThenElse {
  def main(args: Array[String]) {
    
    var ftAway = 4;
    
    var status = if (ftAway < 6) "Infected" else "Probably still infected"
    
    if (status == "Infected") goHome();
  }
  
  def goHome(){
    println("Lock it downnnn");
  }
}