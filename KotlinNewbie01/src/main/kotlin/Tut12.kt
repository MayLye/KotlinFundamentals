// Title: Lists

fun main() {
    /*
    Array is fixed in size, it cannot increase or decrease in size.
    MutableList do have add and remove functions.
    */

    // val array = arrayOf(1, 2, 3)

    val list = mutableListOf(1, 2, 3, 4, 5)
    list.add(6)
    list.remove(2)
    list.removeAt(2)
    println(list)

    // readLine() reads a line of input from the standard input stream.
    /*val list = mutableListOf<Int>()
    for (i in 1..10) {
        val x = readLine()?.toInt()
        if (x != null) {
            list.add(x) // error due to we cannot add items to an array during runtime.
        }
    }
    println(list)*/

    val listA = mutableListOf<Int>()
    for (i in 1..10) {
        val x = readLine()?.toInt()
        if (x != null) {
            listA.add(x) // error due to we cannot add items to an array during runtime.
        }
    }
    println(listA)
}