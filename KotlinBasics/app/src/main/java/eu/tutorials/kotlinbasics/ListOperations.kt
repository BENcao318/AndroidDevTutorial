package eu.tutorials.kotlinbasics

fun main() {
    val fruitsList = mutableListOf("Apple","Banana","Pear","Orange","Grape")
    fruitsList.add("Pineapple")
    fruitsList.remove("Pear")
    println(fruitsList)
    val fruit = "Apple"
    if(fruitsList.contains(fruit)) {
        println("You have $fruit in your list.")
    } else {
        println("You do not have $fruit in your list.")
    }
}