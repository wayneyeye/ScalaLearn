import scala.annotation.tailrec

object s07_nested_method_and_recursion {
  def main(args: Array[String]): Unit = {
    def factorial(i: Int): Long = {
      @tailrec
      def fact(i: Int, accumulator: Int): Long = {
        if (i <= 1) accumulator
        else fact(i - 1, i * accumulator)
      }
      fact(i, 1)
    }
  print(factorial(15))
  }
}
