// Title: Loops
/*
Loops are used in cases where you need to repeat a set of instructions over and over again
until a certain condition is met.
Three primary types of looping: For Loop, While Loop and Do-While Loop.
 */

package cosmiclearn.techbar

fun main(args: Array<String>) {
    println("For Loop: ")
    // Step 1: Initialize the loop with iterable i.
    // Step 2: Checking upto when the loop os valid.
    for (i in 1..5) {
        print(i)
    }
    println()
    println("While Loop: ") // Entry-controlled Loop
    // Step 1: Execute once before checking if the condition is true.
    // Step 2: It will keep on looping until the condition is false.
    var i: Int = 0
    while (i < 10) {
        println(i)
        i++
    }
    println()
    println("Do-While Loop: ") // Exit-controlled Loop
    // The statement is executed first before the condition is evaluated.
    i = 0
    do {
        println(i)
        i++
    } while (i < 10)
    println()
    println("Break: ")
    // When encountered with break, the loop terminates the statement and continue at the next statement.
    i = 0
    while (i < 10) {
        i += 1;
        print(i)
        if (i == 5) {
            break
        }
    }
    println()
    println("Continue: ")
    // Continue will stop the current iteration of the loop and it will start the next iteration.
    i = 0
    while (i < 10) {
        i++
        if (i%2 == 0) {
            continue
        }
        print(i)
    }
}