// Title: Arrays

fun main() {
    // Arrays allow you to save several objects inside of only one object.
    val myIntArray = arrayOf(3, 2, 6, 4)
    println(myIntArray[2])

    /* wrap these up into myStringArray.
    val first = "hello"
    val second = "guys"
    val third = "what's up"*/

    val myStringArray = arrayOf("hello", "guys", "what's up") // [0],[1],[2]
    //  println(myStringArray) // this println doesn't allows us to print arrays.
    println(myStringArray[0]) // we need square bracket to print items inside array.
    println(myStringArray[1])
    println(myStringArray[2])
    //  println(myStringArray[3]) // error due to outOfBounds
}