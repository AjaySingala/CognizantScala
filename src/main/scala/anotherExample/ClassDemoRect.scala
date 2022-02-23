package anotherExample

import org.w3c.dom.css.Rect

class Rectangle(l: Int, b: Int) {
	val length: Int = l
	val breadth: Int = b
	
	def getArea: Int = l * b

	override def toString = s"The length of this Rectangle is ${length} and breadth is ${breadth}"
}

object ClassDemoRect {
	def main(args: Array[String]) {
		val rect = new Rectangle(4, 5)
		println(rect.toString())
		println(s"Area of the rectangle is ${rect.getArea}")

		val rect2 = new Rectangle(10,12)
		println(rect2.toString())
		println(s"Area of the rectangle is ${rect2.getArea}")
	}
}
