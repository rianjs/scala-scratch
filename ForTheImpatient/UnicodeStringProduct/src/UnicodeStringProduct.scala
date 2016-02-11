/**
  * Created by rianjs on 2/10/16.
  */
object UnicodeStringProduct {
  def ComputeStringProduct(s: String) : Long = {
    s.foldLeft(1)(_*_)
  }

  def main(args: Array[String]): Unit = {
    println("Hello".product.toLong)
    println("Hello".map(_.toInt).product)
    println(ComputeStringProduct("Hello"))
  }
}
