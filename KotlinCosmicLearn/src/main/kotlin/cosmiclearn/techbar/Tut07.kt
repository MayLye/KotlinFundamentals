// Title: Decision Making

package cosmiclearn.techbar

fun main(args: Array<String>) {

    // If a condition is satisfied, then perform some actions.
    println("If Then: ")
    var accountBalance: Int = 0
    if (accountBalance < 1000) { // If account balance less than 1000, close account.
        println("Close Account!")
    }
    println()
    /* Extra else statement can be added to an 'if' condition, to execute what should happen,
    if the 'if' condition is not satisfied.*/
    println("If Then Else: ")
    accountBalance = 1001
    if (accountBalance < 1000) {
        println("Close Account!")
    } else {
        println("We love having you with us!")
    }
    println()
    /* If a primary 'if' condition is not satisfied, we add an 'Else If' statement in btw
    to check another condition if required.
     */
    println("If Then Else If Else: ")
    accountBalance = 1000001
    if (accountBalance < 1000) {
        println("Close Account!")
    } else if (accountBalance > 1000000) {
        println("Please find a tour package in your mailbox!")
    } else {
        println("We love having you with us!")
    }
    println()
    println("Nested If Then: ") // We can nest multiple 'If Then' statements.
    accountBalance = 501
    if (accountBalance < 1000) {
        if (accountBalance < 500) {
            println("Close Account!")
        } else {
            println("You better maintain a minimum balance.")
        }
    } else if (accountBalance > 1000000) {
        println("Please find a tour package in your mailbox!")
    } else {
        println("We love having you with us!")
    }
    println()
    println("When: ") // Similar to 'Switch' statement.
    var x: Int = 1
    when (x) {
        1 -> print("x is one") // condition 1
        2 -> print("x is two") // condition 2
        else -> {
            print("x is not good.") // not in all above condition
        }
    }
}