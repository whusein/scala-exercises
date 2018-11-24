package Week2

object Example2_2 {
  def main(args: Array[String]) = {
    var a = 1
    var b = 5
    println(s"The product of square of integers between $a and $b is " + product((x:Int) => x * x)(a, b))
    println(s"The value of $b! is " + factorial(b))

    println(s"The sum of square of integers between $a and $b is " +
      arithmetic((x: Int, y:Int) => x + y)((x:Int) => x * x, 0)(a, b))
  }

  def product(f: Int => Int)(a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a + 1, acc * f(a))
    }
    loop(a, 1)
  }

  def factorial(x: Int): Int = {
    product((x:Int) => x)(1, x)
  }

  def arithmetic(f1: (Int,Int) => Int)(f2: Int => Int, acc: Int)(a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a+1, f1(acc,f2(a)))
    }
    loop(a, acc)
  }
}
