package Week1

object Example1_6 {

  def main(args: Array[String]): Unit ={
    println(sqrt(4))

    val x = 0
    def f(y: Int) = y + 1
    val result = {
      val x = f(3)
      x*x
    } + x
    println(result)
  }

  def sqrt(x: Double) = {

    def sqrtIter(guess: Double): Double = {
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))
    }

    def isGoodEnough(guess: Double): Boolean =
      Math.abs(guess*guess - x) < x * 0.0001

    def improve (guess: Double): Double =
      (guess + x / guess) /2

    sqrtIter(1.0)
  }


}
