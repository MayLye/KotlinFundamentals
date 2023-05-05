// Title: Exception Handling
/* Handling exceptions statements:
- Try and Catch
- Try, Catch and Finally
- Try and Finally
 */

package cosmiclearn.techbar

import java.lang.Exception

// try block -> write statements that can throw an exception.
// catch block -> write the exception handling code.
// finally block -> helps you write code that executes always.

fun main(args: Array<String>) {
    println("Try, Catch and Finally: ")
    try {
        var i: Int = 10;
        throw Exception("Throwing Exception!")
    } catch (e: Exception) {
        e.printStackTrace()
    }
    finally {
        println("In Finally Block!")
    }
    // println("Program Proceeds!")
    println()
    println("Try and Finally: ")
    try {
        var i:Int = 10;
        throw Exception("Throwing Exception!")
    } finally {
        println("Break the rules!")
    }
}