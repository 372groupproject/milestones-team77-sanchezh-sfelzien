import scala.collection.mutable.ListBuffer


object BadBakery {
  //Create userSourdough option, where they will populate class attributes with input
  def main(args: Array[String]) {
    var sourdough = new userSourdough()
    var properSourdough = new properSourdough()
    println("LET'S MAKE SOME BREAD, BABY")
    
    sourdough.starter = stepOne
    println("mixing starter...")
    sourdough.rest = rest
    println("resting for " + sourdough.rest)
    sourdough.riseTime = riseTime
    sourdough.rise = riseSize
    sourdough.ovenTemp = ovenTemp
    sourdough.bakeTime = bakeTime
    sourdough.breadAppearance = breadAppearance
    
    println(sourdough.ovenTemp)
    println(properSourdough.ovenTemp)
    
    
  }
 
//add starter ingredients to class attribute starter list
def stepOne: List[String] = {
  var starter = new ListBuffer[String]()
  println("There are 3 elements to the starter")
  println("Add 1 element to the starter")
  var elementOne = scala.io.StdIn.readLine()
  starter += elementOne
  println("Add next element to the starter")
  var elementTwo = scala.io.StdIn.readLine()
  starter += elementTwo
  println("Add last element to the starter")
  var elementThree = scala.io.StdIn.readLine()
  starter += elementThree
   
   return starter.toList
}

//set rest time of usersourdough object to user input
def rest: Int = {
  println("How many minutes are you gonna let 'er rest?")
   return scala.io.StdIn.readInt()
}

//set rise time of usersourdough object to user input
def riseTime: Int = {
  println("How many hours are you tryna let it rise for?")
   return scala.io.StdIn.readInt()
}

//set rise size of usersourdough object to user input
def riseSize: Double = {
  println("How many times it's OG size should it be after resting?")
   return scala.io.StdIn.readDouble()
}

//set oventemp of usersourdough object to user input
def ovenTemp: Int = {
  println("What temp you gonna preheat the oven to, boss?")
   return scala.io.StdIn.readInt()
}

//set bake time of usersourdough object to user input
def bakeTime: Int = {
  println("How many minutes you gonna let it bake for?")
   return scala.io.StdIn.readInt()
}

//set breadappearance of usersourdough object to user input
def breadAppearance: String = {
  println("What color will indicate it's readiness?")
   return scala.io.StdIn.readLine()
}
  
}