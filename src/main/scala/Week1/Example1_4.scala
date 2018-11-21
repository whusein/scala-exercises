package Week1

object Example1_4 {
  def main (args: Array[String]) {
    var i = -100
    println(s"The absolute value for $i is "  + abs(i))

    def loop: Boolean = loop
    def x = loop // this should work because only call by name
    //println("Trying to print x:  " +  x) -> will cause infinite loop
    //val x = loop -> this one doesnt work because it will lead into an infinite loop (call by value)
  }

  def abs(x: Int) =  if (x >= 0) x else -x
}
