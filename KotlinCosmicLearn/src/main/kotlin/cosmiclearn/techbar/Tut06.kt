// Title: Operators
/*
Postfix operators:  i++, i--
Prefix operators: ++i, --i
 */

package cosmiclearn.techbar

fun main(args: Array<String>) {
    var i: Int = 0
    println("Increment operator: ")
    println("i++: " + i++)
    println("++i: " + ++i)
    println()
    println("Decrement operator: ")
    println("i--: " + i--)
    println("--i: " + --i)
    println()
    println("Unary operators: ") // Work only with one operand.
    /*
    +i: Positive value of i.
    -i: Negative value of i.
    inv: Bitwise complement, it flips the bit.
    !: Logical NOT operator, it flips true/false.
     */
    var j: Int = 23
    println("+j: " + +j)
    println("-j: " + -j)
    println("~j: " + j.inv()) // using bitwise operator of 0 and 1 to determine the answer.
    var jLie: Boolean = true
    println("~jLie: " + !jLie)
    println()
    /*
    *: Multiply
    %: Modulo Operator
    /: Division Operator
     */
    println("Multiplication/Division Operators: ")
    var k: Int = 24
    println("k*2: " + k * 2)
    println("k/3: " + k / 3)
    println("k%5: " + k % 5)
    println()
    println("Addition/Subtraction Operators: ")
    var l: Int = 24
    var m: Int = 12
    println("l+m: " + l + m)
    println("l-m: " + (l - m))
    println()
    println("Referential Operators: ")
    /*
    ===: Check referential equality operator.
    !==: Check referential inequality operator.
     */
    var n: Int = 24
    var o: Int = 24
    println("i===j: " + (i===j))
    println("i!==j: " + (i!==j))
    println()
    println("Relational Operators: ")
    /*
    <: Less than Operator
    >: Greater than Operator
    <=: Less than or Equal to Operator
    >=: Greater than or Equal to Operator
     */
    var p: Int = 24
    var q: Int = 12
    println("i<j: " + (i<j))
    println("i>j: " + (i>j))
    println("i>=j: " + (i>=j))
    println("i<=j: " + (i<=j))
    println()
    println("Equality Operator: ")
    /*
    ==: Check if left operand is equal to the right operand.
    !=: Check if left operand is not equal to the right operand.
     */
    var r: Int = 24
    var s: Int = 24
    println("r==s: " + (r==s))
    println("r!=s: " + (r!=s))
    println()
    println("Bitwise AND, OR, XOR: ")
    var t: Boolean = true
    var u: Boolean = false
    println("t and u: " + (t and u)) // AND operator
    println("t or u: " + (t or u)) // OR operator
    println("t xor u: " + (t xor u)) // XOR operator
    println()
    println("Logical AND & OR: ")
    var v: Boolean = true
    var w: Boolean = false
    println("v&&w: " + (v && w)) // true and false = false
    println("v||w: " + (v || w)) // true or false = true
    println()
    println("Assignment Operators: ")
    /*
    =: Assignment Operator
    +=: Add and Assign Operator
    -=: Subtract and Assign Operator
    *=: Multiply and Assign Operator
    /=: Divide and Assign Operator
    %=: Modulo and Assign Operator
     */
    var x: Int = 5
    x += 5
    println("x+=5: " + x)
    x -= 2
    println("x-=2: " + x)
    x *= 3
    println("x*=3: " + x)
    x /= 8
    println("x/=8: " + x)
    /*  Special Operators:
    []  Index access operator.
    !!  Assertion not null operator.
    $   String templates expression operator.
    ?   Null check call operator.
    ..  Range operator.
    ::  Create a class reference.
    :   Name type separator.
    ->  Lambda operator.
    ?   Mark type as null.
    @   Annotation, loop reference, lambda reference operator.
    ;   Statement operator.
     */
}