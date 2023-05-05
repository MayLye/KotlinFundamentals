// Homework: VarArg, Default and Named Parameters

/* Challenge:
Create a function alternating sum that takes a VarArg parameter so a variable number of integers
and then that function should return the alternating sum of those numbers.
 */

fun main() {
    val sum = alternatingSum(3, 4, 5, 2, 1, 2, 3)
    // alternating sum is 3-4+5-2+1-2+3=4
    println("The alternating sum is $sum")
    println()
    val sum2 = alternatingSum2(3, 4, 5, 2, 1, 2, 3)
    println("The alternating sum2 is $sum2")
}

fun alternatingSum(vararg numbers: Int): Int {
    var sum = 0
    var toggle = true
    for(number in numbers){
        if(toggle) {
            sum += number
        } else {
            sum -= number
        }
        toggle = !toggle
    }
    return sum
}

fun alternatingSum2(vararg numbers: Int): Int {
    var sum2 = 0
    var toggle = true
    for(number in numbers){
        if(toggle) {
            sum2 += 5
        } else {
            sum2 -= 1
        }
        toggle = !toggle
    }
    return sum2
}
