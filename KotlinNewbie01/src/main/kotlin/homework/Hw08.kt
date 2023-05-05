// Homework: Null Values and User Input

fun main() {

    // Challenge: enter your age
    println("Please enter your age:")
    val age = readLine()
    if (age != null) {
        if (age.toInt() < 18) {
            println("You are a kid.")
        } else if (18 < age.toInt() && age.toInt() < 80) {
            println("You are an adult.")
        } else {
            println("You are very very old.")
        }
    }

    // solution 2 as follows:
    println("Please enter your age:")
    val age2 = readLine()?.toInt()
    if (age2 != null) {
        if (age2 > 0 && age2 < 18) {
            println("You are a kid.")
        } else if (18 < age2 && age2 < 80) {
            println("You are an adult.")
        } else {
            println("You are super old.")
        }
    }

}