object s02_range {
  def main(args: Array[String]): Unit = {
    println(1 to 10) // shorthand for scala range
    println(1 until 10) // not inclusive
    println(1 to 10 by 3 ) // stepsize
    println(BigDecimal(1.1) to BigDecimal(10.4) by BigDecimal(3.1)) // use of BigDecimal to preserve the precision
  }
}
