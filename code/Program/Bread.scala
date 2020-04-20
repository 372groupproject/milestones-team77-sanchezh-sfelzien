//superclass (or trait as it's called in scala) for sourdough attributes
trait Bread {
  var starter: List[String] = List("wheat flour", "white flour", "water")
  var rest: Int = 30
  var rise: Double = 2.5
  var riseTime: Int = 4
  var ovenTemp: Int = 450
  var bakeTime: Int = 40
  var breadAppearance: String = "golden brown" 
  
}