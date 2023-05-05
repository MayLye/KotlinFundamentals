//Homework: For Loop

fun main() {
    // Challenge 1: create an array, and put some numbers in it, then write a for loop that calculates the sum of that array.
    // The sum of the array is 27.
    val homeArray = arrayOf(4, 3, 5, 6, 8, 1)
    var sum = 0
    for (item in homeArray) {
        sum += item
    }
    println("The sum of the array is $sum")

    // Challenge 2: Enter 5 numbers
    println("Enter 5 numbers:")
    var avg = 0.0
    for (i in 1..5) {
        val input = readLine()?.toInt()
        if (input != null) {
            avg += input / 5.0
        }
    }
    println("The average value is $avg")
}