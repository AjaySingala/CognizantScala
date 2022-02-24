package anotherExample

class InvalidAgeException(msg: String) extends Exception(msg) {}

class ExceptionExample {
    def validate(age: Int) : Unit = {
        if(age < 18) {
            throw new InvalidAgeException("You are not eligible")
        }
        else {
            println(s"${age}: You are eligible!")
        }
    }
}

object CustomException {
    def main(args: Array[String]) : Unit = {
        val ee = new ExceptionExample()
        try {
            ee.validate(20)
            ee.validate(12)
        }
        catch {
            case e: InvalidAgeException => println(s"ERROR!!! Invalid Age Exception: ${e.getMessage}")
            case e: Exception => println(s"Some exception occurred... ${e.getMessage}")
            case _ => println("Something went wrong...")
        }
    }
}