package anotherExample

object TupleDemo {
    def main(args: Array[String]) {
        val data = createTuple()
        println("Printing the tuple values...")
        data.productIterator.foreach(println)
    }

    def createTuple() = {
        var myTuple = (1, "John", "Smith", 3000)
        myTuple
    }
}