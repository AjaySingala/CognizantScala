package anotherExample

object LazyLoadDemo {
    def main(args: Array[String]) {
        val doSomething = {
            println("This is for initialization only...")
            209
        }

        println("This is before invoking 'doSomethin'...")
        // Pass #1.
        println(doSomething)

        println("This is before invoking 'doSomethin' again...")
        // Pass #2.
        println(doSomething)

        println("Finishing up...")
    }
}