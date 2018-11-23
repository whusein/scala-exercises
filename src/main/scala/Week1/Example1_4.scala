package Week1

object Example1_4 {
  def main (args: Array[String]) {
    var i = -100
    println(s"The absolute value for $i is "  + abs(i))

    def loop: Boolean = loop
    def x = loop // this should work because only call by name
    //println("Trying to print x:  " +  x) -> will cause infinite loop
    //val x = loop -> this one doesnt work because it will lead into an infinite loop (call by value)

    var a = false
    var b = true

    println(s"$a and $a is " + and(a,a))
    println(s"$a and $b is " + and(a,b))
    println(s"$a or $a is " + or(a,a))
    println(s"$a or $b is " + or(a,b))

  }

  def abs(x: Int) =  if (x >= 0) x else -x

  def and(x: Boolean, y: Boolean) = {
    if (!x) false else y
  }

  def or(x: Boolean, y: => Boolean) = {
    if (x) true else y
  }
}
