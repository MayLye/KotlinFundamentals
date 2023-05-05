// Title: When

// In Kotlin, "when" replaces the switch operator of other languages like Java
fun main() {
    println("Enter your age:")
    val age = readLine()?.toInt()

    /* put these whole if condition into WHEN:
        if (age in 0..5) {
            println("You're a kid.")
        } else if (age in 6..17) {
            println("You're a teenager.")
        } else if (age == 18) {
            println("Finally, you're 18!")
        } else if (age == 19 || age == 20) {
            println("You're an adult.")
        } else if (age in 21..65) {
            println("You're middle age.")
        } else {
            println("You're very old.")
        }*/

    // use WHEN statement to simplify some types of IF statements and if conditions.
    when (age) {
        in 0..5 -> println("You're a kid.")
        in 6..17 -> println("You're a teenager.")
        18 -> println("Finally, you're 18!")
        19, 20 -> println("You're an adult.")
        in 21..65 -> println("You're middle age.")
        else -> println("You're very old.")
    }

    // 2nd situation:
    println()
    println("Enter your dependent's age:")
    val ageA = readLine()?.toInt()
    when (ageA) {
        in 0..5 -> {
            println("He/She is a young kid.")
        }
        in 6..17 -> println("He/She is a teenager")
        18 -> println("Finally, He/She is 18")
        19, 20 -> println("He/She is an adult.")
        in 21..65 -> println("He/She ise middle age A.")
        else -> println("He/She is very old.")
    }

}
