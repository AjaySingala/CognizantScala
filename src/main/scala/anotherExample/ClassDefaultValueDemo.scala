package anotherExample

class Car(val make: String, var reserved: Boolean = true, val year: Int = 2017) {
    override def toString = s"Car details $year  $make  Reserved: $reserved"

    def show() {
        println(s"${year}  ${make}  Reserved: ${reserved}")
    }
}

object ClassDefaultValueDemo {
    def main(args: Array[String]) {
        val car1 = new Car("Audi")
        car1.show()
        println(car1.toString())

        val car2 = new Car("Honda", false)
        car2.show()

        val car3 = new Car("Toyota", false, 2021)
        car3.show()

        //val car4 = new Car("Toyota", 2021)
        val car4 = new Car("Toyota", year = 2021)
        car4.show()

        val car5 = new Car(year = 2021, make = "BMW", reserved = false)
        car5.show()
    }
}