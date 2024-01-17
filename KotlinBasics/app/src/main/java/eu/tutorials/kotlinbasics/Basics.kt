package eu.tutorials.kotlinbasics

fun main() {
    var age = 0
    println("Please enter you age as a full number")
    var enteredValue = readln()
    age = enteredValue.toInt()

    if (age >= 18 && age < 40) {
        println("You can go into the club")
    } else if (age >= 40) {
        println("You are too old")
    } else{
        println("You are too young to go into the club!")
    }
}