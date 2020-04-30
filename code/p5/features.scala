package p5

import ._
import scala.reflect._
import org.coroutines._
import scala.reflect.api.materializeTypeTag


object features {
  def main(args: Array[String]) {
    highOrderFunc
    wildCard
    options
 
  }
  
  def highOrderFunc{
    val examplelist: List[String] = List("beef","tofu","ham","salami")
    examplelist.map(x=> println(x ++ " sandwhich"))
  }
  
  //constructs a list from 5 to 50, filters from that list values that are evenly divisble by 10 and sums them
  def wildCard {
    println((5 to 50).toList filter (_%10 == 0) reduce (_+_))
  }
  
  //hashmap in scala
  def options{
    val sandwhichmap: Map[Int, String] = Map(
    1-> "Ham", 2->"Cornbeef", 3->"Turkey")
    
    println("Enter 1, 2, or 3")
  var elementOne = scala.io.StdIn.readInt()     
    println(sandwhichmap.get(elementOne).get)
  }
  
  def TypeTags{
    val tt = typeTag[Int]
    val ct = classTag[String]
    
  }
  

  

}
  