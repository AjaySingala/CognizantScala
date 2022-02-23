package anotherExample

case class Message(sender: String, recipient: String, body: String)

trait SuperTrait
case class CaseClass1 (a: Int, b: Int) extends SuperTrait
case class CaseClass2 (a: Int) extends SuperTrait
case class CaseClass3 () extends SuperTrait

object CaseClassDemo {

    def matchCase(someObject: SuperTrait) = someObject match {
        case CaseClass1(x, y) => println(s"a = ${x} and b = ${y}") 
        case CaseClass2(x) => println(s"a = ${x}") 
        case CaseClass3() => println(s"Nothing here!") 
        case _ => println("Unidentified object.")
    }

    def main(args: Array[String]) {

        matchCase(CaseClass1(10,50))
        matchCase(CaseClass2(100))
        matchCase(CaseClass3())

        // val msg1 = Message("ajay@yahoo.com", "john.smith@outlook.com", "This is a test message")
        // println(s"From: ${msg1.sender}. To: ${msg1.recipient}")
        
        // // Comparison.
        // val msg2 = Message("ajay@yahoo.com", "john.smith@outlook.com", "This is a test message")
        // println(s"From: ${msg2.sender}. To: ${msg2.recipient}")

        // val areTheySame = msg1 == msg2
        // println(s"Both messages are same?: ${areTheySame}")

        // val msg3 = Message("ajay.singala@yahoo.com", "john.smith@outlook.com", "This is a test message")
        // println(s"From: ${msg3.sender}. To: ${msg3.recipient}. Body: ${msg3.body}")

        // val areTheySame2 = msg1 == msg3
        // println(s"Both messages are same?: ${areTheySame2}")

        // // Copying.
        // val msg4 = msg3.copy(sender = msg3.recipient, recipient = msg3.sender)
        // println(s"From: ${msg4.sender}. To: ${msg4.recipient}. Body: ${msg3.body}")
    }
}