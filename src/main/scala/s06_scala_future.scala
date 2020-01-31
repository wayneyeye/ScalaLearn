import scala.concurrent.Future
//this is the implicit arg for Future methods
import scala.concurrent.ExecutionContext.Implicits.global
object s06_scala_future {
  def main(args: Array[String]): Unit = {

    def sleep(millis:Long)={
      Thread.sleep(millis)
    }
    def doWork(index: Int)={
      sleep((math.random*1000).toLong)
      index
    }
    (1 to 5 ) foreach {
      index=>val future=Future {doWork(index)}
        println(future.hashCode())
        future onSuccess {
          case answer:Int => println(s"Success! returned: $answer")
        }
        future onFailure {
          case th: Throwable => println(s"FAILURE! returned $th")
        }

    }
    sleep(3000)
    println("Finished")
  }
}
