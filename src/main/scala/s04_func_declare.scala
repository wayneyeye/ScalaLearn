object s04_func_declare {
  def main(args: Array[String]): Unit = {
    val p1=new Point()
    println(p1)
    println(p1.shift(3,3))
  }
}
/*
* 当一个类被声名为case class的时候，scala会帮助我们做下面几件事情：
1 构造器中的参数如果不被声明为var的话，它默认的话是val类型的，但一般不推荐将构造器中的参数声明为var
2 自动创建伴生对象，同时在里面给我们实现子apply方法，使得我们在使用的时候可以不直接显示地new对象
3 伴生对象中同样会帮我们实现unapply方法，从而可以将case class应用于模式匹配，关于unapply方法我们在后面的“提取器”那一节会重点讲解
4 实现自己的toString、hashCode、copy、equals方法
除此之此，case class与其它普通的scala类没有区别
* 协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/lovehuangjiaju/article/details/47176829
* */
case class Point(x:Double=0.0, y:Double=0.0){
  def echo=println("Point:echo")
  def shift(deltax:Double =0.0, deltay:Double=0.0)=copy(x+deltax,y+deltay)
}