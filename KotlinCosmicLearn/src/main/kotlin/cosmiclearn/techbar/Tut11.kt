// Title: Strings
// Strings are immutable and represent an array of characters.

package cosmiclearn.techbar

fun main(args: Array<String>) {
    println("Normal Strings: ")
    var x: String = "Hello World"
    var y: String = """The
    Quick 
    Brown
    Fox
    """
    println(x)
    println(y)

    print("String Templates: ") // can contain expression.
    x = "Iceberg"
    y = "My name is $x"
    println(y)
    println()
    print("Index Operator String: ") // get a particular character from String using index operator
    y = "Hello" // Index" 0,1,2,3,4
    var z: Char
    z = y[1] // Index 1 is e
    println(z)
    println()
    print("Iterate a String: ")
    var str1: String = "Hello"
    for (item in str1) { // Loop thru all items in str1
        print(item)
        // use println(item) to print vertical
    }
    println()
    println("Common String Operations: ")
    var s: String = "Hello"
    println("Length of string $s is ${s.length}")
    println("Init cap of string is ${s.capitalize()}")
    println("Lower case is ${s.toLowerCase()}")
    println("Upper case is ${s.toUpperCase()}")

}