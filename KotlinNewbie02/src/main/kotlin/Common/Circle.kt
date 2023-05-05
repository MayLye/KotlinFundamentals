package Common

// Apply only to Tut18 & Tut19

class Circle (
    val radius: Double
) : Shape("Circle") {
    val pi = 3.141592

    init {
        println("$name created with radius = $radius")
        println("$name area is ${area()}")
        println("$name perimater is ${perimeter()}")
    }

    fun area() = radius * radius * pi

    fun perimeter() = 2 * radius * pi

}