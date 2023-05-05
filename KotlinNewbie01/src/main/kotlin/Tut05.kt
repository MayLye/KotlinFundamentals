// Title: Strings

fun main() {
    val x: String = 10.toString()
    println("This x is a string of ${x}.")

    var swing = "example of string is swing!"
    println("Our ${swing}")

    swing = "uppercase"
    println("Our example of ${swing} is ${swing.uppercase()}.")

    swing = "LOWERCASE"
    println("Our example of ${swing} is ${swing.lowercase()}")
}