// quick initialize a scala class
class Person(val name:String, var age:Integer)
object s01_var_val {
  def main(args: Array[String]): Unit = {
    val p=new Person("Scala",10)
    println(p.name)
    println(p.age)
    println(p.hashCode())
    // modify the age is permitted
    p.age=15
    println(p.age)
    println(p.hashCode()) // they have the same hashcode even the member value has changed
    // modify the name is not allowed
    // p.name="Java"
  }
}
