// Title: Decimal Numbers

fun main() {
    // Float is 32-bit number
    // Double is 64-bit number, double has 2x more precision than float.
    val m = 223
    val n = 77
    val result: Int = m / n
    println(result.toDouble())
    println(result.toFloat())

    val a = 22.38989898F // F for Float type
    val b = 5.5F
    println(a + b)
    println("The result of a*b is ${a * b}")

    val c = 45.454545 // without F, indicates Double, which is more accurate.
    val d = 12.121212
    println(c / d)
    println("The result of c/d is ${c / d}")

    val x = 3
    val y = 4
    val z = 5
    println("x: $x")
    println("x + y: ${x + y}")
    println("x + y + z: ${x + y + z}")
}