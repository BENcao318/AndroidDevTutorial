package eu.tutorials.kotlinbasics

fun main() {
    makeCoffee(0, "Ben")
    makeCoffee(1, "Ben")
    makeCoffee(3, "Andy")
    println("Add number 1 to the array:")
    val num1 = readln().toInt()
    println("Add number 2 to the array:")
    val num2 = readln().toInt()
    println(add(num1,num2))

    println("Add number 1 to the division:")
    val numd1 = readln().toDouble()
    println("Add number 2 to the division:")
    val numd2 = readln().toDouble()
    println(divide(numd1,numd2))
}

fun makeCoffee(sugarCount: Int, name: String) {
    if (sugarCount == 1) {
        println("Coffee with $sugarCount spoon of sugar for $name")
    } else if (sugarCount < 0) {
        println("Please enter > 0 spoon of sugar")
    } else if (sugarCount == 0) {
        println("Coffee with no sugar for $name")
    }
    else {
        println("Coffee with $sugarCount spoons of sugar for $name")
    }
}

fun add(num1: Int, num2:Int):Int {
    val result = num1 + num2
    return result
}

fun divide(num1: Double, num2: Double): Double {
    return num1 / num2
}