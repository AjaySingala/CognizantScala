package anotherExample

object VariableArguments {
    def main(args: Array[String]) {
        printStrings("Hello", "there!", "How", "are", "you", "doing?")
        printStrings("Hello again")
        printStrings("How", "is", "the", "weather.")
    }

    def printStrings(someValues: String*) {
        var i: Int = 0
        for(aValue <- someValues) {
            println(s"The value[$i] is ${aValue}")
            i += 1
        }
    }
}