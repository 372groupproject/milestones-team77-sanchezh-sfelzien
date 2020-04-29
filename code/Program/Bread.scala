//superclass (or trait as it's called in scala) for sourdough attributes
trait Bread {
  var starter: List[String] = List("wheat flour", "white flour", "water")
  var rest: Int = 30
  var rise: Double = 2.5
  var riseTime: Int = 4
  var ovenTemp: Int = 450
  var bakeTime: Int = 40
  var breadAppearance: String = "golden brown" 
  
      def canEqual(a: Any) = a.isInstanceOf[Bread] 

    override def equals(that: Any): Boolean =
        that match 
    { 
        case that: Bread => that.canEqual(this) &&  
                    this.hashCode == that.hashCode 
        case _ => false
    } 
       
    // Defining hashcode method 
    override def hashCode: Int = { 
        val prime = 31
        var result = 1
        result = prime * result + rest;
        result = prime * result + riseTime;
        result = prime * result + riseTime;
        result = prime * result + ovenTemp;
        result = prime * result + bakeTime;
        result = prime * result +  
                (if (breadAppearance == null) 0 else breadAppearance.hashCode) 
        result = prime * result +  
                (if (rise == null) 0 else rise.hashCode) 
        return result 
    } 
  
}