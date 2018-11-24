package Week2

object Example2_1 {
 def main(args: Array[String]) = {

   var a = 1
   var b = 5
   println(s"sumInts between $a and $b is " + sumInts(a, b) )

   println(s"sumCubes between $a and $b is " + sumCubes(a, b))

   println(s"$b factorial is " + fact(b))

   println(s"sumFact between $a and $b is " + sumFact(a, b))

   println(s"sumFact between $a and $b is " + sumSomething(a, b, fact))

   println(s"sumCubes between $a and $b is " + sumSomething(a, b, (x: Int) => x * x * x ))

   sum((x: Int) => x * x * x)(a, b)

   println(s"sumCubes between $a and $b is " + sum((x: Int) => x * x * x )(a, b))
 }
  def sumInts(a: Int, b: Int): Int  = {
    if (a > b) 0 else a + sumInts(a+1,b)
  }

  def cube(x: Int) = x * x * x

  def sumCubes(a:Int, b: Int): Int = {
    if (a > b) 0 else cube(a) + sumCubes(a+1, b)
  }

  def fact(x: Int): Int = {
    if (x == 0) 1 else x * fact(x-1)
  }

  def sumFact(a: Int, b: Int): Int  = {
    if (a > b) 0 else fact(a) + sumFact(a+1, b)
  }

  def sumSomething(a:Int, b: Int, f: Int => Int ): Int = {
    if (a > b) 0 else f(a) + sumSomething(a+1, b, f)
  }

  def sum(f: Int => Int)(a: Int, b: Int): Int= {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a + 1,acc + f(a))
    }
    loop(a,0)
  }
}
