// Title: Classes
// Object is a combination of state and behaviour. It is also an instance of a class.
// Class is a blueprint from which objects are created.It is a combination of data and functions.

package cosmiclearn.techbar

fun main(args: Array<String>) {
    println("Example 1: ")
    val emp1 = Employee(1, "Mugambo") // empId=1, empName=Mugambo
    println(emp1.empId)
    println(emp1.empName)
    println()
    println("Example 2: ")
    val emp2 = Employee2()
    println(emp2.empId)
    println(emp2.empName)

}

class Employee (_empId: Int, _empName: String) { // values in constructor define later.
    var empId: Int
    var empName: String
    init {
        empId = _empId
        empName = _empName
    }
}

class Employee2 (_empId: Int = 12, _empName: String = "Robert") { // define default values in constructor.
    var empId: Int
    var empName: String
    init {
        empId = _empId
        empName = _empName
    }
    constructor(): this(12,"Robert") // this(_empId,_empName)
}
