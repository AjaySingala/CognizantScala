package anotherExample

object OverloadDemo {
    def main(args: Array[String]) {
        println(add(1,10))
        println(add(1,10,100))
    }

    def add(a: Int, b: Int): Int = {
        a + b
    }

    def add(a: Int, b: Int, c: Int) : Int = {
        a + b + c
    }
}