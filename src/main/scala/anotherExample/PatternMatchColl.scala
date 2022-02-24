package anotherExample

object PatternMatchColl {
    def main(args: Array[String]) {

        val statuses = List(500,404)
        val msg = statuses match {
            case m if m contains(500) => "has error"
            case _ => "it's okay!"
        }

        println(msg)

        val msg2 = statuses.head match {
            case m if m < 500 => "okay"
            case _ => "whoa! An Error!"
        }

        println(msg2)

        val msg3 = statuses match {
            case List(500,404) => "server error and not found error"
            case List(404,500) => "not found error and server error"
            case List(200,200) => "ALL OK"
            case _ => "not sure what happened"
        }

        println(msg3)

    }
}