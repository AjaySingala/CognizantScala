package anotherExample

import scala.io.Source
object FileDemo {
    def main(args: Array[String]) {
        println("Reading a file...")

        Source.fromFile("C:\\Temp\\Demo.txt").foreach {
            print
        }

        println("\nReading lines now...")
        val filename = "C:\\Temp\\Demo.txt"
        for(line <- Source.fromFile(filename).getLines) {
            println(line.toUpperCase())
        }

        val lineArray = Source.fromFile(filename).getLines.toArray
        val lineList = Source.fromFile(filename).getLines.toList
        println("\nDemo'ing .mkString...")
        val lineString = Source.fromFile(filename).getLines.mkString
        println(lineString)

        val fileHandle = Source.fromFile(filename)
        for(line <- fileHandle.getLines()) {
            println(line)
        }

        fileHandle.close

    }
}