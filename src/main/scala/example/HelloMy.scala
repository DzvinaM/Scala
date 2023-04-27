package example
import java.util

object hello {
  def main(args: Array[String]) = {

    /*    println("Please enter your name: ")
    val name = readLine()

    println("Hello " + name + "!")*/
  }

  val str1 = "qwerty my new qwerty".split(" ").mkString
  val str2 = "qwerty my new qwerty".split(" ").mkString(":-)")
  val str3 = "qwerty my new qwerty".split(" ").mkString("q", " / ", "y")

  println(str1)
  println(str2)
  println(str3)

  val myClass = MyClass(13) //-> also works
//  val myClass = MyClass.apply(13)
  val list: List[MyClass] = List(myClass, myClass.sumMy(10), myClass.sumMy(7))
  println(list)

}
