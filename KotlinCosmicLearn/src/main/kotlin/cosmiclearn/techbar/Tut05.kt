// Title: Data Types
// Byte, Boolean, Char, Short, Int, Long, Float, Double, String, Array.

package cosmiclearn.techbar

fun main(args: Array<String>) {
    val a: Byte = 1
    println("Byte - 8bits" + ". Example: " + a)

    val b: Char = 'a'
    println("Char - 8bits" + ". Example: " + b)

    val c: Short = 2
    println("Short - 16bits" + ". Example: " + c)

    val d: Int = 10
    println("Int - 32bits" + ". Example: " + d)

    val e: Long = 100
    println("Long - 64bits" + ". Example: " + e)

    val f: Float = 23.17F
    println("Float - 32bits" + ". Example: " + f)

    val g: Double = 17.23
    println("Double - 64bits" + ". Example: " + g)

    val h: Boolean = false
    println("Boolean - 16bits" + ". Example: " + h)
    println()

    println("Array: ")
    val i: IntArray = intArrayOf(1,2,3,4,5) // using arrayOf helper
    // Access elements of an array via index.
    println(i[0])
    println(i[1])
    println()

    println("Strings: ") // represent an array of characters. Immutable.
    val j: String = "Hello World" // Single-line String
    println(j)
    // Multi-line String
    val k: String = """The      
    Quick
    Brown
    Fox
    """
    println(k)
    println()

    println("String Templates: ") // Strings that contain expression and get evaluated.
    val m: String = "Iceberg"
    val n: String = "My name is $m"
    println(n)
}