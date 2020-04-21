import scala.io.StdIn.{readLine,readInt}
object SimpleProg {
  def main(args: Array[String]) {
    val arr = Array[Any](123, 'a', "abc", "def", "foo", 1.3456, 456, 'a', 2.9945)
    val ints = Array[Int]()
    val bools = Array[Boolean]()
    val double = Array[Float]()
    val strings = ""
    val xt = readInt()
    print (xt)
  val a = List(1,2,3,4,5)
  val b = a.filter(x => x > 3)
  val c = arr.filter(x=> x.isInstanceOf[Double])
  print(c(0))
  
    
    arr.foreach(x =>{
      if(x.isInstanceOf[Int]){
        val c = ints :+ x
          
        print(c(0))
      }
})}}
