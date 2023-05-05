// Title: Generics
// is used when we want a generic data structures 'independent' of Data Type.

package cosmiclearn.techbar

class Datum<T>(t: T) {
    // create a placeholder variable called T, which can store 'any' data type based on initialization.
    var data = t
}

fun main(args: Array<String>) {
    var dataInt = Datum<Int>(2)
    var dataFloat = Datum<Float>(2.3f)

    println(dataInt.data)
    println(dataFloat.data)
}