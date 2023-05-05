// Homework: Functions and Parameters

// Challenge: Write a function that prints the result of the "Sum of the values from 1 to 5 is 15."
// Tip: Use the highest number as argument.
fun main() {
    sumUpToN(10)
}

fun sumUpToN(n: Int) {
    var result = 0
    for(i in 1..n) {
        result += i
    }
    // above formula shows the solution of 1+2+3+4+5+6+7+8+9+10=55
    println("The sum of the values from 1 to $n is $result")
}