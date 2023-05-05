// Homework: IF

fun main() {
    // Challenge: The string is racecar, and it is not a palindrome.
    // palindrome means a word that reads the same either in forward or backward sequence.
    val myString = "racecar"
    if (myString.reversed() == myString) {
        println("This string $myString is palindrome.")
    } else {
        println("This string $myString is not a palindrome.")
    }

}