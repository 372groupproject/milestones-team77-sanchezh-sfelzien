import scala.collection.mutable.ArrayBuffer

trait Derp {
  val phrase: String
}

class Hector(val phrase: String) extends Derp
class Sam(val phrase: String) extends Derp

object Trait {
  def main(args: Array[String]) {
    val hector = new Hector("I respect the vision, daddy")
    val sam = new Sam("Going for a run, cheif")

    val idiots = ArrayBuffer.empty[Derp]
    idiots.append(hector)
    idiots.append(sam)
    idiots.foreach(derp => println(derp.phrase))
  }
}
