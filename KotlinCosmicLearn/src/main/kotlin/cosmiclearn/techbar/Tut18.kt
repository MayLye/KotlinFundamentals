// Title: Extension -> we can extend a class with new functionality.

package cosmiclearn.techbar

class C {
    fun printHi() {
        println("Hello There")
    }
}

fun C.printBye() {  // extend class C with new method printBye().
    println("Bye There")
}

fun main(args: Array<String>) {
    // calling two methods in class C:
    var x = C()
    x.printHi()
    x.printBye()
}