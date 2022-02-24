package anotherExample

case class NewPerson(firstname: String, lastname: String, title: String)

object FilterDemo {
    def main(args: Array[String]) {
        val people = Seq(
            NewPerson("Ajay", "Singala", "Mr."),
            NewPerson("John", "Smith", "Mr."),
            NewPerson("Mary", "Jane", "Ms."),
            NewPerson("Jane", "Doe", "Mrs.")
        )

        val beginsWithJ = people.filter(_.firstname.startsWith("J"))
        println(beginsWithJ)

    }
}