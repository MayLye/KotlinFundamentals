// Title: Operator Overloading -> allows us to overload operators for our custom classes.
/* Sample formula:
var C1 = Complex(1,3)
var C2 = Complex(2,4)
var C3 = C1 + C2
var C4 = C2 - C1
 */

package cosmiclearn.techbar

class Complex(val real: Int, val imaginary: Int) { // real & imaginary
    operator fun plus(c: Complex): Complex { // + operation
        return Complex(real + c.real, imaginary + c.imaginary) // (real, imaginary)
    }
    operator fun minus(c: Complex): Complex { // - operation
        return Complex(real - c.real, imaginary - c.imaginary) // (real, imaginary)
    }

    override fun toString(): String {
        return this.real.toString() + "+" + this.imaginary.toString() + "i" // real+imaginary(i)
    }
}

fun main(args: Array<String>) {
    var C1 = Complex(1,3)
    var C2 = Complex(2,4)
    var C3 = C1 + C2
    var C4 = C2 - C1
    println(C3)
    println(C4)
}