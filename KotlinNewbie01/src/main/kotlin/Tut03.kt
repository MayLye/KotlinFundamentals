// Title: Arithmetic Operators

fun main() {
    val x = 15
    val y = 7
    var result = x + y
    println(result)

    result = x - y
    println(result)

    result = (x + x)*(y + 2)
    println(result)

    result = (y + y)/2
    println(result)

    result = (x + y) % 5
    println(result)

    var a = 20
    var b = 10
    println("The result of a + b is ${a + b}")

    a = 30
    b = 6
    println("The result now is ${a + b}")

    println(x * y + a + b)

    val age = 35
    val favoriteNumber = 20
    println("I am $age years old and my favourite number is $favoriteNumber.")
}