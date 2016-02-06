

object Signum {
  def GetSignum(n: Int): Int = n match {
      case n if n < 0 => -1
      case n if n > 0 => 1
      case _ => 0
  }
  
  def main(args: Array[String]) = {
      val sig = GetSignum(-5)
      println(sig)
      println(GetSignum(4500))
      println(GetSignum(0))
  }
}