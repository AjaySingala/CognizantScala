package anotherExample

class Outer {
    class Inner {
        private def foo() {
            println("Inner.foo()...")
        }

        class InnerMost {
            foo()
        }

        def show()
        {
            foo()
        }
    }

    //(new Inner()).foo()
    //val inner = new Inner()
    //inner.foo()
    def showFoo() {
        val inner = new Inner()
        //inner.foo()     // ERROR!
        inner.show()
    }
}

object AccessModDemo {
    def main(args: Array[String]) {
        val outer = new Outer()
        val inner = new outer.Inner()
        val innermost = new inner.InnerMost()

        outer.showFoo()
        inner.show()
    }
}
