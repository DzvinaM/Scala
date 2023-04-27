package example
package Calculator

object Calculator {
  def main(args: Array[String]): Unit = {

    var ch: Char = 0
    var num1: Int = 0
    var num2: Int = 0
    var result: Int = 0

    print("Choose operation ( * / + - ) ")
    ch = scala.io.StdIn.readChar()

    print("First number ")
    num1 = scala.io.StdIn.readInt()

    print("Second number ")
    num2 = scala.io.StdIn.readInt()

    ch match {
      case '+' => result = num1 + num2
      case '-' => result = num1 - num2
      case '*' => result = num1 * num2
      case '/' => result = num1 / num2
      case _   => printf("Invalid operation")
    }

    println("Result: " + result)
  }
}
