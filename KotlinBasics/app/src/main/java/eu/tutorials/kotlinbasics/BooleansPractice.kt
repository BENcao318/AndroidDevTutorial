package eu.tutorials.kotlinbasics

fun main() {
    val myTrue = true
    val myFalse = false

    println(myTrue || myFalse)  //This will be true
    println(myFalse && myTrue)  //This will be false
    println(!myTrue)            //This will be false
}