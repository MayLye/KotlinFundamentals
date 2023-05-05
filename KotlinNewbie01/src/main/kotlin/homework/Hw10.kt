// Homework: While Loop

fun main() {
    var x = 3
    var y = 4
    // Challenge 1: write a program which lets you enter a number, and it will count from 10 to 0.
    println("Enter your number:")
    var z = 10
    while (z > 7) {
        println(z)
        z--
    }
    // solution 2:
    println("Please enter your number:")
    var m = readLine()?.toInt()
    println("Let's count from $m down to 0:")
    while (m != null && m >= 0) {
        println(m)
        m--
    }

    // Challenge 2:
    println("Enter number 1:")
    var n = readLine()?.toInt()
    println("Enter number 2:")
    var p = readLine()?.toInt()
    var result = 1
    var j = 0
    while (j < y) {
        result *= x
        j++
    }
    println("$x to the power of $y is $result.")

}