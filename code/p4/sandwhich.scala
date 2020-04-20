package p4

class sandwhich extends meat
{  
    var breadType: String = "sourdough"
    var condiment: String = "mustard"
      
    // Method  
    def details()  
    {  
        println("bread: " + breadType)
        println("Meat: " + meatType) 
        println("Sauce: " + condiment)
    }  
}  