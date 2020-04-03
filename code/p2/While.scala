package p2

object While {
  def main(args: Array[String]) {

    var ftAway = 0;

    while (ftAway < 6) {
      println("Move " + (6 - ftAway) + " feet back");
      ftAway += 1;
    }
  }
}