// Title: Lambda
// can be used to create functions.

package cosmiclearn.techbar

// Syntax: val lambdaname = {arg1 -> expression,...argn -> expression}
fun main (args: Array<String>) {
    println("Basic Lambda: ")
    val sayHi = {x: String -> print("Hi $x\n")}
    sayHi("Mugambo!")
    sayHi("Kush Hua!")
    println()
    println("Filter Lambda: ")
    var countryNames: List<String> = arrayListOf("United States","United Kingdom","India")
    print("Before Filter: ")
    println(countryNames)
    var countryNamesFilter: List<String> = countryNames.filter { // Filter countries that starts with U.
        s -> s.startsWith("U")
    }
    print("After Filter: ")
    println(countryNamesFilter)
}