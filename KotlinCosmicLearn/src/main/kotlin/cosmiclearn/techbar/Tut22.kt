// Title: Collections -> have both mutable and immutable collections.
/*
Mutable Collections can be modified. Operations will not create a new collection.
Immutable Collections cannot be modified. New collection is created when operations are performed on them.
 */
// Example: List, Set, Map.

package cosmiclearn.techbar

fun main(args: Array<String>) {
    // List -> stores a list of elements. Can also store duplicate values. listOf().
    println("List example: ")
    var listOfPlanets = listOf("Mercury", "Venus", "Earth")
    for (planet in listOfPlanets) {
        println(planet)
    }
    println()
    // Set -> stores a list of elements. Cannot have duplicates. setOf()
    println("Set example: ")
    var setOfFruits = setOf("Apple", "Pineapple", "Grapes")
    for (fruit in setOfFruits) {
        println(fruit)
    }
    // Map -> implements a key value pair dictionary, query the map with a key, and get the value stored in it.
    println("Map example: ")
    val alphabetMap = mutableMapOf("A" to "Apple", "B" to "Ball", "C" to "Cat") // key-value pair: alphabet to word.
    for ((alphabet, word) in alphabetMap) {
        println(alphabet + "for" + word)
    }
}


