// Title: Functions
/*
A function is a statements that accomplish an objective.
In Kotlin, function is declared using 'fun' keyword.
 */

package cosmiclearn.techbar

fun main(args: Array<String>) {

    println("Function multiNums: ")
    val resMultiNums = multiplyNums(2, 3, 4)
    println(resMultiNums)

    println("Function add: ")
    val resAdd = add(2, 3)
    print(resAdd)
}

// fun funname(arg1: datatype, arg2: datatype....): Return datatype
fun funname(arg1: Int, arg2: String): Boolean {
    return funname(arg1, arg2)
}

fun add(i: Int, j: Int): Int {
    return i + j
}

fun addInfer(i: Int, j: Int) = i + j // Inferred function

fun add2(i: Int, j: Int = 3): Int { // Assign default value to some arguments.
    return i + j
}

fun helloKotlin(): Unit { // A function that does not return any value is actually returning Unit.
    println("Hello Kotlin")
}

fun multiplyNums(vararg numArgs: Int): Int {
    var result = 1
    for (numArg in numArgs) { // A function can have variable numbers of arguments.
        result = result * numArg
    }
    return result
}