// Title: Abstract Classes
/*
- Cannot be instantiated, which means cannot create an instance.
- Can create subclass. Subclass here is used to implement abstract methods.
- Can also have implemented methods.
- Always open.
 */

package cosmiclearn.techbar

abstract class Animals {
    abstract fun makeNoise()
    fun sleep() {
        println("Zzzzzzz")
    }
}
class Cats: Animals() {
    override fun makeNoise() {
        println("Meowwwww")
    }
}

class Dogs: Animals() {
    override fun makeNoise() {
        println("Wooooof")
    }
}


fun main(args: Array<String>) {
    var cat = Cat()
    cat.makeNoise()
    var dog = Dog()
    dog.makeNoise()
}
