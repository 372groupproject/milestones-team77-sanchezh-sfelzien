package p4

object mildlyuseful {
   def main(args: Array[String]) {
  println("hi")
    println("Enter 1 for salad or 2 for sandwich")
    var mealType = scala.io.StdIn.readInt()
    makeFoodType(mealType)
   }
   
     def makeFoodType(mealType: Int){
    if (mealType == 1){
       println("What type of lettuce?")
       var lettuceType= scala.io.StdIn.readLine()
       getFoodDetails(mealType, lettuceType)
    } else {
      println("What type of bread?")
      var breadType= scala.io.StdIn.readLine()
      println("Oh wait, we only have sourdough")
      breadType = "sourdough"
      getFoodDetails(mealType, breadType)
      
    }
    
  }
  def getFoodDetails(mealType: Int, carrierType: String){
    println("What type of meat?")
    var meatType= scala.io.StdIn.readLine()
    println("I think you meant ham")
    meatType = "ham"
    
    println("What type of sauce?")
    var sauceType= scala.io.StdIn.readLine()

    
    if(mealType == 1){
      var obj = new salad()  
        obj.lettuceType= carrierType
        obj.dressing= sauceType
        obj.details
    } else {
        var obj = new sandwhich()  
        obj.breadType= carrierType
        obj.condiment= sauceType
        obj.details
    }
  }
}