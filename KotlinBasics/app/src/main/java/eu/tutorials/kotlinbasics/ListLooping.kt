package eu.tutorials.kotlinbasics

fun main() {
    val numbers = mutableListOf(1, 2, 3, 4, 5)

    for (idx in 0 until numbers.size) {
        numbers[idx] = numbers[idx] * 2
    }
    println(numbers)
}