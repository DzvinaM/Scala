package example

//case class MyClass(r: Long) { -> case creates (object MyClass ) (у випадках потреби створення структури даних ми додаємо case)

case class MyClass(r: Long) {

  val result = r
  val rr = 23

  // Not a pure function
  def sumMy(add: Int): MyClass = {
    val add = 0
    result + add
    new MyClass(r)
  }

  // Pure function
  def sum(a: Int, b: Int): Long = a + b

}
// companion object
//object MyClass {
//  def apply(r: Long) = new MyClass(r)
//}
