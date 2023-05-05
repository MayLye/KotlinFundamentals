// Homework: Extension Functions

// Challenge: write an extension function for integer lists that returns the product of that list.
// So it will take a list that looks like:
// The product of [1 ,2, 3, 4, 5, 6] is 720.

// Tips: Implement function product that calculates the product of specific list.

fun main() {
    val list = listOf(1,2,3,4,5,6)
    // list.product gives you the answer of 1x2x3x4x5x6=720.
    println("The product of $list is ${list.product()}")
}

// we extend the type of List Integer with function product and that function returns integer
fun List<Int>.product(): Int {
    var result = 1
    for(value in this) {
        result *= value
    }
    return result
}