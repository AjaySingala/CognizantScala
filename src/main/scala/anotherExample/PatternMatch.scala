package anotherExample

import scala.util.matching.Regex

object PatternMatch {
    def main(args: Array[String]) {
        val pattern = "Scala".r
        val pattern2 = new Regex("(S|s)cala")
        val str = "Scala is scalable and quite cool."

        println(pattern findFirstIn str)

        println((pattern2 findAllIn str).mkString(","))

        val pattern3 = "(S|s)cala".r
        println(pattern3 replaceFirstIn(str, "Python"))
        println(pattern3 replaceAllIn(str, "Python"))
    }
}