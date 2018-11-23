package Week1

import scala.annotation.tailrec

object Example1_7 {
  def main(args: Array[String]): Unit = {
    var a = 21
    var b = 14
    println(s"The GCD for $a and $b is " + gcd(a, b))

    var c = 5
    println(s"Factorial for $c is " + factorial(c))

    println(s"Factorial for $c is " + trfactorial(c))
  }
  @tailrec
  def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  def factorial(n: Int): Int = if (n == 1) n else n * factorial(n-1)


  def trfactorial(n: Int): Int = {
    @tailrec
    def loop(acc: Int, n: Int): Int =  {
      if (n > 1) loop(acc * n, n - 1)
      else acc
    }
    loop(1,n)
  }
}
