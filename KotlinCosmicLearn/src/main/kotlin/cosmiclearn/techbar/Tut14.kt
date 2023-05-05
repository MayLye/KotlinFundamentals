// Title: Inheritance -> allows us to declare a hierarchy of classes.

package cosmiclearn.techbar

open class Animal { // parent class Animal
    open fun makeNoise() {
        println("durrrrr")
    }
}

class Cat: Animal() { // Cat is inherited from Animal class
    override fun makeNoise() {
        println("meowwwww") // override parent class noise of durrrrr
    }
}

class Dog: Animal() { // Dog is inherited from Animal class
    override fun makeNoise() {
        println("wooooof") // override parent class noise of durrrrr
    }
}

fun main(args: Array<String>) {
    var animal = Animal()
    animal.makeNoise()
    animal = Cat()
    animal.makeNoise()
    animal = Dog()
    animal.makeNoise()
}