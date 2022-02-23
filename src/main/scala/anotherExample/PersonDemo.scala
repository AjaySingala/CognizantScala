package anotherExample

class Person (id: Int, fname: String, lname: String) {
    private val Id: Int = id
    private val FirstName: String = fname
    val LastName: String = lname

    def fullName() {
        println(s"My name is ${FirstName} ${LastName}")
    }
}

object PersonDemo {
    def main(args: Array[String]) {
        val person1 = new Person(101, "John", "Smith")
        //println(s"Hello ${person1.LastName}, ${person1.FirstName}")
        person1.fullName()

        val person2 = new Person(102, "Mary", "Jane")
        //println(s"Hello ${person2.LastName}, ${person2.FirstName}")
        person2.fullName()
    }
}
