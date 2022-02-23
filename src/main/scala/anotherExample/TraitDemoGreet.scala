package anotherExample

trait Greeting {
	def greet()
	def show() {
		println("This is the show() method of the trait 'Greeting'.")
	}
}

abstract class Meeting extends Greeting {
	// def greet(){
	// 	println("Hey there! Welcome to Traits!")
	// }
}

class FinalMeeting extends Meeting {
	def greet(){
		println("Hey there! Welcome to Traits!")
	}
}

trait A {
	def showA()
}

trait B {
	def showB()
}

class ClassAB extends A with B {
	def showA() = println("showA()...")
	def showB() = println("showB()...")
	def showClassAB() {
		println("This is showClassAB of the implemented class...")
	}
}

object TraitDemoGreet {
	def main(args: Array[String]) {
		val meet = new FinalMeeting()
		meet.greet()
		meet.show()

		val ab = new ClassAB()
		ab.showA()
		ab.showB()
		ab.showClassAB()
	}
}
