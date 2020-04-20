package p4

class salad extends meat{
  var lettuceType: String = "romaine"
  var dressing: String = "pink"
      
    // Method  
    def details()  
    {  
        println("Lettuce: " + lettuceType)
        println("Meat: " + meatType) 
        println("Dressing: " + dressing)
    }  
}