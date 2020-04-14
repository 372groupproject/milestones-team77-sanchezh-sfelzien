object Unit{
  def main(args: Array[String]): Unit = {
    println("Unit in scala is like void in Java, it can be used to declare")
    println("what a function will return")
    def doLittle(x: (Int) => Unit) = {
            x('a');  
            x(1);  
            x('b'); 
        } 
    doLittle(println)
  }
}
