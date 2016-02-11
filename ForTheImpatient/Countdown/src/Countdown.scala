object Countdown {
  def CountdownRecursive(n: Int) : Unit = n match {
    case 0 => println (n)
    case _ => {
      println(n)
      CountdownRecursive(n - 1)
    }
  }

  def CountdownLoop(n: Int) : Unit = {
    for (i <- n to 0 by -1) {
      println(i)
    }
  }

  def main(args: Array[String]) = {
    CountdownRecursive(5)
    CountdownLoop(3)
  }
}
