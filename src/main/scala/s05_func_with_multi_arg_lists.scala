object s05_func_with_multi_arg_lists {
  def main(args: Array[String]): Unit = {
    var c=Circle(Point(0,0),5)
    println(c)
    c.draw(Point(0,1))(s=>println(s))
    c.draw()(s=>println(s))
    c.draw(Point(1,1)){s=>println(s)}
  }
}
abstract class Shape(){
  def draw(offset:Point=Point(0,0))(f:String=>Unit):Unit=f(s"draw(offset=$offset), ${this.toString()}")
}
case class Circle(center:Point, radius: Double) extends Shape
