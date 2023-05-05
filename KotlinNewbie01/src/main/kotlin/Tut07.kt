// Title: IF Conditions

fun main() {
    val x = 7
    val y = 7
    val z = if((x + y) == 14) 3 else 4
    println(z)
    /* The long code for val z is as follows:
     val z = if((x + y) == 14) {
        println(3)
    } else {
        println(4)
    }
     */
    if ((x < y) || ((y * y) == 49)) {
        println("at least one of the conditions is true.")
    } else if (x > y) {
        println("x is greater than y.")
    } else {
        println("x is equals to y.")
    }
    println("the value of z is $z")

}