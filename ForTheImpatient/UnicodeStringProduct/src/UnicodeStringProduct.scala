/**
  * Created by rianjs on 2/10/16.
  */
object UnicodeStringProduct {
  def ComputeStringProduct(s: String) : Long = {
    s.foldLeft(1L)(_*_)
  }

  def main(args: Array[String]): Unit = {
    println("Hello".product.toLong)
    println("Hello".map(_.toLong).product)
    println(ComputeStringProduct("Hello"))
  }
}
