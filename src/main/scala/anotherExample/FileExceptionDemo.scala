package anotherExample

import scala.io.Source
import java.io.FileNotFoundException
import java.io.IOException

object FileExceptionDemo {
    def main(args: Array[String]) {
        println("Reading a file...")

        println("\nHandling exceptions...")
        try {
            val invalidFilename = "C:\\Temp\\Invalid.txt"
            val fileHandle2 = Source.fromFile(invalidFilename)
            for(line <- fileHandle2.getLines()) {
                println(line)
            }
            
            fileHandle2.close
        }
        catch {
            case e: FileNotFoundException => println("ERROR! Could not find file with the given name...")
            case e: IOException => println("ERROR! Some I/O Exception occurred...")
            case _ => println("Something went wrong. Please check and retry...")
        }
        finally {
            // close the file handle / db connection.
            println("This will happen no matter what!!")
        }

    }
}