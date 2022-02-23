package anotherExample


object RecursiveDemo {
    def power(x: Int, y: Int): Long = {
        println(s"x = ${x}. y = ${y}")
        if(y >= 1) {
            x * power(x, y-1)
        }
        else {
            1
        }
    }

    def main(args: Array[String]) {
        println(s"Result is ${power(2,8)}")
    }
}
