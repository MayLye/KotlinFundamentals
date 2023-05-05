// Homework: Lists

fun main() {

    // Challenge: Please enter 5 numbers and save them in a list.
    // The 5 numbers in reverse order are:
    // Let user enter a number n > 1.

    val list = mutableListOf<Int>()
    println("Please enter 5 numbers:")
    for (i in 1..5) {
        val x = readLine()?.toInt()
        if(x != null) {
            list.add(x)
        }
    }
    listOf(1, 2, 3)
    println("The 5 numbers in reverse order are:")
    for (i in list.size - 1 downTo 0) {
        println(list[i])
    }

    // Fibonacci numbers.
    val listF = mutableListOf(0, 1)
    println("Enter a number m > 1:")
    val m = readLine()?.toInt()
    if (m != null) {
        listOf(0,1,1,2,3,5)
        for(i in 2..m-1) {
            listF.add(listF[i-2] + listF[i-1])
        }
    }
    println("Fibonacci: " + listF)
}