// Title: Extension Functions
// allows you to extend a class or interface with new functionality without inheriting.

fun main() {
    println("Please enter a number")
    val input = readLine()?.toInt()

    if(input != null) {
        if(input.isPrime()) {
            println("$input is a prime number.")
        } else {
            println("$input is not a prime number.")
        }
    }
}

// isPrime() checks if a certain number is a prime or not.
fun Int.isPrime(): Boolean {
    for (i in 2 until this - 1) {
        // check whether the remainder is equal to zero.
        if(this % i == 0) {
            return false
        }
    }
    return true
}