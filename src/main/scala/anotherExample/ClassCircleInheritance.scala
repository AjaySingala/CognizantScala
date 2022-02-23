package anotherExample

trait ShapeBase {
    def draw()
    // def erase()
    // def redraw()
    // val x: Int
    // val y: Int
    // val area: Float
}

trait AnotherShapeBase {
    def paint()
}

class Circle extends ShapeBase{
    val radius = 5;
    def calcArea = {
        println(radius * radius)
    }

    override def draw() {
        println("Circle...")
    }
}

class Sqr extends ShapeBase {
    override def draw() {
        println("Square...")
    }
}

class Rect extends Sqr {
}

class Triangle extends AnotherShapeBase {
    override def paint() {
        println("Triangle...")
    }
}

class Sphere extends Circle {
    override def calcArea = {
        println(radius * radius * radius)
    }

    override def draw() {
        println("Sphere...")
    }
}

object ClassCircleInheritance {
    def main(args: Array[String]) {
        // val sphere = new Sphere()
        // sphere.calcArea
        // sphere.draw()

        val circle: ShapeBase = new Circle()
        //circle.calcArea
        circle.draw()

        val sq: ShapeBase = new Sqr()
        sq.draw()

        //val sphere2: ShapeBase = new Triangle()     // Type Mistmatch error.
        //val tri: ShapeBase = new Triangle()

    }
}
