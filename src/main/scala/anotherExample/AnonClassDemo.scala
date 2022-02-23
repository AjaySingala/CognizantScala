package anotherExample

abstract class Listener {
    def trigger
}

object AnonClassDemo {
    def main(args: Array[String]) {
        val myListener = new Listener {
            def trigger {
                println(s"This is the Trigger implementation of myListener...")
            }
        }

        myListener.trigger
    }
}