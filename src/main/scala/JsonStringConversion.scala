
import net.liftweb.mongodb.record._

/**
  * trait for converting various model types to json strings.
  */
trait JsonStringConversion[T <: MongoRecord[T]] {
  /**
    * convert a list of MongoRecords to a string.
    */
  //def toJsonString[T <: List[MongoRecord[]]](x : T): String = {
  def toJsonString(x : List[T]): String = {
    val y = (for (a <- x) yield (a.asJSON))
    "[" + y.mkString(", ") + " ]"
  }

}
