// Title: For Loop

// A "For" Loop is used to repeat a specific block of code a 'known' number of times.
fun main() {
    print("For Loop: ")
    val myArray = arrayOf(1, 2, 3)
    for (i in myArray) {
        print(i)
    }
    println()
    print("Range: ")
    for (i in 1..5) {
        print(i)
    }
    println()
    print("DownTo: ")
    for (i in 10 downTo 5) {
        print(i)
    }
    println()
    print("DownTo with Step: ")
    for (i in 10 downTo 5 step 2) {
        print(i)
    }
    println()
    print("A to Z: ")
    for (i in 'a'..'z') {
        print(i)
    }
    println()
    print("Other array: ")
    val otherArray = arrayOf(4,5,6,7,9,11,13)
    var max = otherArray[5]
    for (item in otherArray) {
        // for each item, we want to check if that item is larger than max.
        if (item > max) {
            max = item
        }
    }
    print(max) // print only the maximum.
}