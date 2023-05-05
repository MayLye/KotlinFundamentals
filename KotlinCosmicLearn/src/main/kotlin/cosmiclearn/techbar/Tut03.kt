// Title: Variables

package cosmiclearn.techbar

/* Two types of declarations:
val - once declared it cannot be changed.
var - once declared it can be changed.
 */
/* Syntax:
val varname: Datatype = value
var varname: Datatype = value
var varname = value
 */

fun main(args: Array<String>) {

    val a: Int = 3  // Declaration of an integer val.
    val b = 1       // Non-declaration, datatype inferred by Kotlin.
    val c: Int      // If you are not initializing but only declaring, you must provide the type.
}