// Title: Logical And Comparison Operators

fun main() {
    val x = 4
    val y = 5
    val z = 9
    // comparison operator to check:
    println(x == y) // if both variables is the same.
    println(x < y) // if x is less than y.
    println(x <= y) // if x is less than or equals to y.
    println(x > y) // if x is greater than y.
    println(x != y) // if x is different from y.

    val a = 6
    val b = 10
    println(!(x == y) || a == b) // OR operator
    println(!(x == y) && a == b) // AND operator

    val bool = true
    val simpleExpression = 5 > 6 || 6 > 5 && 6 <= 6
    println(simpleExpression)
    val hardExpression = !(x != z) && bool || z > (x + y) && (!bool || y < z)
    println(hardExpression)
}