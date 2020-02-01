object s10_options {
  def main(args: Array[String]): Unit = {
    var o1=None
    // raise an error
    // println(o1.get)
    // defensive method
    println(o1.getOrElse("error")) // use getOrElse to force the behaviour when meeting null

  }
}
