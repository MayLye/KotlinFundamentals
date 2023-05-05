// Title: VarArg, Default and Named Parameters

// VarArg stands for variable arguments. It is used to pass a variable number of arguments to a function.
// Default arguments are used to provide default value to a function parameter.
fun main() {
    // intArrayOf() function creates a new array that can hold integer elements.
    val array = intArrayOf(10, 20 ,25)
    // save the maximum of a sequence of numbers in the variable max here and set that to getMax().
    val max = getMax(1,2,7,3,5,6,10,*array,13,15,3,1,5) // use *array to insert the above array here.
    println("The maximum is $max.")

    // specify a search string here:
    searchFor("How to become a good programmer?")
    searchFor("How to become the best Kotlin programmer?", "Bing") // we want to search on Bing here instead of Google.
    searchFor(searchEngine = "Bing", search = "How to become the best Android developer?") // use parameter search and insert sthg for that.
}

// write a function that searches for a specific string on the internet.
fun searchFor(search: String, searchEngine: String = "Google") {
    println("Searching for '$search' on $searchEngine")
}

// getMax function here is used to return the maximum out of a sequence of numbers and return integer.
fun getMax(vararg numbers: Int): Int {
    // initially we set the maximum to the first value of our numbers.
    var max = numbers[0]
    // then we check for each number in all of those passed numbers if the current number is greater than the maximum,
    // and if it is greater than maximum, then we found a new maximum adn set that to the current number and
    for(number in numbers) {
        if(number > max) {
            max = number
        }
    }
    // finally we need to return the value of max.
    return max
}