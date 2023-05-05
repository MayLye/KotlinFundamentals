// Homework: Decimal Numbers

import kotlin.math.pow

fun main() {
    // Challenge: calculate the volume of a sphere with radius of 8.8.
    // The answer is 1605.680571620358
    // Formula for the volume: 0.75 * pi * radius^3
    val radius = 8.8 // Double type, without F
    val pi:Double = Math.PI

    var volume: Double = 0.75 * pi * radius * radius * radius
    println("The volume of the sphere with the radius of $radius is ${volume}.")

    volume = 0.75 * pi * radius.pow(3)
    println("The more advanced formula will be [0.75 * pi * radius.pow(3)] which gives the same result of ${volume}. ")
}