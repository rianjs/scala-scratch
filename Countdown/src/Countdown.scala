object Countdown {
  def CountdownRecursive(n: Int) : Unit = n match {
    case 0 => println (n)
    case _ => {
      println(n)
      CountdownRecursive(n - 1)
    }
  }

  def main(args: Array[String]) = {
    CountdownRecursive(5)
  }
}
