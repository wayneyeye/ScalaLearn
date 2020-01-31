object s03_partial_func {
  // a partial function would not generate an outcome for every input type
  def main(args: Array[String]): Unit = {
    val pf1:PartialFunction[Any,String]={case _: String => "STRING"}
    //test
    println(pf1("abc"))
    // create another partial function
    val pf2:PartialFunction[Any,String]={case _: Double => "DOUBLE"}
    println(pf2(1.1d))
    try {println(pf2("abc"))}
     // will cast an exception of Match Error
    catch { case _:MatchError=> println("MatchError")}
    // chaining of partial functions
    val pf=pf1 orElse pf2
    println(pf(123d)) // will match the double case
    try {println(pf(123))}
      // will cast an exception of Match Error
    catch { case _:MatchError=> println("MatchError")}

    // test functions of whether a match is expected
    println(pf.isDefinedAt(5d))
  }
}
