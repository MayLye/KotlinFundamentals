// Title: While Loop

// A "While" Loop is used to repeat a specific block of code an 'unknown' number of times, until a condition is met
fun main() {
    var x = 3
    while (x > 0) {
        // as long as x is > 0, the code in {} will be executed until the condition of x > 0 is false.
        println("hello")
        x--
    }
    println("what's up")

    var y = 4
    while (y < 7) {
        println("Hola")
        y++
    }

    val myArray = arrayOf("Hello", "Guys", "What's Up") // put 3 strings in an array
    val arrayLength = myArray.size // save the length of the array in the variable arrayLength, which is 3.
    var i = 0 // i starts at zero
    while (i < arrayLength) { // check is i is less than arrayLength.
        println(myArray[i])
        i++
    }

}