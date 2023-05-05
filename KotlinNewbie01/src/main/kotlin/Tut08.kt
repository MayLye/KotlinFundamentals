// Title: Null Values and User Input

fun main() {
    // null means the string has the option to not contain anything (or empty object).
    // readLine() will block our code until the user enter info.

    val userInput = readLine() // forever return a string as stated.
    println("You entered $userInput") // this line will be printed in the console.
    // put ? to check whether is it null.
    println(userInput?.toUpperCase())

    if (userInput != null) {
        // don't need? because we know the userInput won't be null.
        println(userInput.toInt() - 5)
    }

}