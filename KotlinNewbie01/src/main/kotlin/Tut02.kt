// Title: Var, Val, Integer, Boolean

// CTRL+SHIFT+F10 to run straightaway.
fun main() {
    // var is a mutable variable that can be changed or reassigned. Variable.
    // val is an immutable variables that cannot be altered or reassigned. Constant.

    var myVariable = 7
    println(myVariable)
    println("The value of variable is: $myVariable")

    myVariable = 17
    println(myVariable)

    val secondVariable = 22
    println(secondVariable)

    val c: Int
    c = 8
    println(c)

    val thirdVariable: Boolean = true
    println(thirdVariable)
}