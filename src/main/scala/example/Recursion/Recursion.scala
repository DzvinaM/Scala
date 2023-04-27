package example.Recursion

import scala.annotation.tailrec

object Recursion {
  def main(args: Array[String]): Unit = {

    @tailrec
    def f(list: List[Int], acc: Int): Int = list match {
      case Nil          =>
        println(s"final result acc $acc")
        acc
      case head :: tail =>
        println(s"acc = $acc")
        f(tail, acc + head)
    }

//    f(List[Int](1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 0)
//    f(Range(1, 30000).toList, 0)

    def `ja to mnozu`(list: List[Int], acc: Int = 1): Int = list match {
      case _ if acc < 1 => 0
      case Nil          => acc
      case head :: tail => `ja to mnozu`(tail, head.*(acc))
    }

    println(`ja to mnozu`(List[Int](1, 2, 3)))

    def sumNumbers(num: Int, acc: Int): Int = {
      if (num < 0)
        acc
      else {
        sumNumbers(num - 1, num + acc)
      }
    }

//    println(sumNumbers(30000, 0))

  }
}
