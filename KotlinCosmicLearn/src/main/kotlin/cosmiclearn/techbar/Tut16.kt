// Title: Interface -> is a contract which specifies what the interface should do.
/* can contain only the following:
- Abstract methods.
- Abstract properties.
- Properties with getter.
- Implemented methods.
 */

package cosmiclearn.techbar

interface IEmployee {
    // two properties:
    val empId: Int
    val company_name: String
    // two functions:
    fun update()
    fun companyName() {
        println("CosmicLearn")
    }
}

class EmployeeIn: IEmployee { // Implementation of IEmployee interface.
    override val empId = 0
    override val company_name = "Cosmic Learn"
    override fun update() {
        println("Updating employee.")
    }
}

fun main(args: Array<String>) {
    var empIn = EmployeeIn()
    empIn.update()
    empIn.companyName()
}