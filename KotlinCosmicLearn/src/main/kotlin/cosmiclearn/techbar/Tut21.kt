// Title: Enums -> are named constants.

package cosmiclearn.techbar

enum class DayOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY
    /* Initializa with numbers:
    Sunday(0)
    Monday(1)
    Tuesday(2)
    Wednesday(3)
    Thrusday(4)
    Friday(5)
    Saturday(6)
     */
}

fun main(args: Array<String>) {
    var dayNow = DayOfWeek.SUNDAY
    println(dayNow)
}