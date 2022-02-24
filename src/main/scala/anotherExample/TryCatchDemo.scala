package anotherExample

//import java.io.Exception

object TryCatchDemo {
    def main(args: Array[String]) {
        try {
            val i = 10
            val j = 5

            val x = i / j
            println(s"The result is ${x}")
        }
        catch {
            case e: ArithmeticException => println("An Arithmetic exception occured...")
        }
        finally {
            println("This is the finally block...")
        }
    }
}
