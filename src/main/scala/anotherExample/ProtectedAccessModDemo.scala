package anotherExample

class Super {
    protected def foo() {
        println("Super.foo()...")
    }
}

class Sub extends Super {
    def show() {
        foo()
    }
}

// class Other {
//     (new Super).foo()
// }

object ProtectedAccessModDemo {
    def main(args: Array[String]) {
        val sub = new Sub()
        sub.show()

        //(new Sub).foo()
    }
}