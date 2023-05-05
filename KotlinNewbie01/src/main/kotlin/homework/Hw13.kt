// Homework: When

fun main() {
    // Challenge: Greet in different languages
    println("Where are you from?")
    val country = readLine()
    when (country) {
        "India" -> println("speak Hindi.")
        "Russia" -> println("speak Russian.")
        "France" -> println("speak French.")
        else -> println("speak English.")
    }
}
