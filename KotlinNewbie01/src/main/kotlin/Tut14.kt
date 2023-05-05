// Title: Functions and Parameters

fun main() {
    printPow(3,5) // 3 to the power of 5.
    printPow(5,2)
    printPow(7,8)
    printPow(2,10)

    printThreeLines()
}

fun printPow(base: Int, exponent: Int) {
    var result = 1
    for(i in 1..exponent) {
        result *= base
    }
    println("$base to the power of $exponent is $result")
}

fun printThreeLines() {
    println("First")
    println("Second")
    println("Third")
}

