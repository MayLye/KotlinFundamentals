// Title: Functions with Return Value

// To return values, we use the return keyword.
fun main() {
    val pow = printPowA(3,5) // 3 to the power of 5.
    // this calculates the results of 3x3x3x3x3=243
    println("3 to the power of 5 is $pow.")
    println(multiply(3,5)) // result of 3x5=15
}

fun multiply(a: Int, b: Int) = a*b

// calculate the base to the power of exponent, returns an integer which actually the results of that calculations.
fun printPowA(base: Int, exponent: Int): Int {
    var result = 1
    for(i in 1..exponent) {
        result *= base
    }
    return result
    // functions after return statement will be canceled.
}

