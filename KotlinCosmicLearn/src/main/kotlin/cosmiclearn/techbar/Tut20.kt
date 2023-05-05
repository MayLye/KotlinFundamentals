// Title: Data Class -> allow us to create class with only data.

package cosmiclearn.techbar

data class EmployeeB (val empId: Int, val empName: String)

fun main(args: Array<String>) {
    var employee = EmployeeB(1723,"Mugambo") // only data, no data type.
    println(employee.empId)
    println(employee.empName)
}

/* Data Classes:
- toString implementation.
- equals and hashCode implementation.
- Component functions.
- Copy function.
 */