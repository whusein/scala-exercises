package Week1

  // Example: Square roots with Newton's Method

object Example1_5 {
  def main (args: Array[String]) {
    var i = List(0.001, 1e-20, 1.0e20, 1.0e50)

    i.foreach(x => println(s"Square root of $x is " + sqrt(x)))

  }

  def sqrt(x: Double) = sqrtIter(1.0, x)

  def sqrtIter(guess: Double, x: Double): Double = {
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)
  }

  def isGoodEnough(guess: Double, x: Double): Boolean =
    Math.abs(guess*guess - x) < x * 0.0001

  def improve (guess: Double, x: Double): Double =
    (guess + x / guess) /2

}
