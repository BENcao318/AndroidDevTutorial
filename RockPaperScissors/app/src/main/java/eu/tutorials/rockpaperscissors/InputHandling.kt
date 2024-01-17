package eu.tutorials.rockpaperscissors

fun main() {
    var inputNumber = 0
    println("Please enter a number.")
    while(true) {
        val inputString = readln().toIntOrNull()
        if(inputString != null) {
            inputNumber = inputString
            break
        } else {
            println("Please enter a valid integer.")
        }
    }
    val multiplier = 5
    println("Result of operation is: ${ inputNumber * multiplier }")
}