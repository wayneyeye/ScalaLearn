object s09_literals {
  def main(args: Array[String]): Unit = {
    println(1 getClass)
    println(1L getClass)
    println(0xA)
    //octal literals are obsolete
    // println(013)
    println(0.1 getClass)
    println(0.1d)
    println(4.1f getClass)
    println(4.1f)
    var s1=
      """
        |abc
        |abc\n abc
        |""".stripMargin
    println(s1)
    println("end")

    // Tuple
    val tup1=(1,"two") //pair
    println(tup1.getClass)
    println(tup1)
  }
}
