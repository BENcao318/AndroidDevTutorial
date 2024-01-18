package eu.tutorials.kotlinbasics

class Dog (val name: String, val breed: String, var age: Int = 0){
    init {

    }
    fun bark() {
        println("$name says Woof Woof")
    }
}