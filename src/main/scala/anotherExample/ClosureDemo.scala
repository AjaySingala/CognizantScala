package anotherExample

object ClosureDemo {

    val rate = 0.10
    val time = 2

    // Closure: uses / references variables defined outside the function. 
    def calcSimpleInterest(principal: Double) : Double = {
        (principal * rate * time) / 100
    }

    def main(args: Array[String]) {
        val amt = calcSimpleInterest(10000)
        println(s"Amount is ${amt}")
    }
}
