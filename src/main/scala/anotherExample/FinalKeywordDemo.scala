package anotherExample

class Shape {
    final val area: Int = 100

    final def calcArea() {
        println("Calculating area of the shape...")
    }
}

class Square extends Shape {
    //override val area: Int = 150

    // override def calcArea() {
    //     println("Calculating area of the Square...")
    // }

    def draw() {
        println(s"Drawing a Square with an area of ${area}...")
    }
}

object FinalKeywordDemo {
    def main(args: Array[String]) {
        var sq = new Square()
        sq.draw()
        sq.calcArea()
    }
}