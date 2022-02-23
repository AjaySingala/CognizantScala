package anotherExample

object AnotherHello {
  var name: String = "Ajay"

  def main(args: Array[String]) {
    println("Another Foo project")
    println(name)
  }

  def foo() {
    println(name)
    bar(24)
  }

  def bar(age: Int) {
    val salary = 1000
    println(age)
    println(salary)
  }
}
