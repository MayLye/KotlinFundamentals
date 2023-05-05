// Title: Ranges ..

package cosmiclearn.techbar

fun main(args: Array<String>) {

    print("Normal Range: ")
    for (i in 1..5) { // Ranges from 1 to 5
        print(i)
    }
    println()
    print("Reverse Range: ")
    for (i in 5 downTo 1) { // Ranges from 5 to 1
        print(i)
    }
    println()
    print("Step Range: ") // Increases the step function
    for (i in 1..10 step 2) { // Step up 2 steps from 1 to 10
        print(i)
    }
    println()
    print("Exclude Range: ") // Excluding
    for (i in 1 until 5) { // Exclude the last value
        print(i)
    }
}