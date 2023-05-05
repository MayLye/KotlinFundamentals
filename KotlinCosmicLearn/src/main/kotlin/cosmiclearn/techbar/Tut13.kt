// Title: Properties and Fields
/*
var -> These properties can be changed once initialized.
val -> These properties cannot be changed once initialized.
 */

package cosmiclearn.techbar

fun main(args: Array<String>) {
    println("Example 1: ")
    val emp3 = Employee3()
    println(emp3.empName)
    println(emp3.deptName)
    println()
    println("Example 2: ")
    val emp4 = Employee4()
    emp4.empName = "Mugambo"
    println(emp4.empName)
}

class Employee3 {
    var empName: String = "Robert"
    var deptName: String = "Mugamboo"
}

class Employee4 { // Properties can have getter and setter methods.
    var empName: String = ""
        get() = field.toString() // get value from field and put into String.
        set(value) {
            field = value.toUpperCase() // set the value to uppercase.
        }
}

