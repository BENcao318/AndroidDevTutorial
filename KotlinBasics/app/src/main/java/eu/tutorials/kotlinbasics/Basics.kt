package eu.tutorials.kotlinbasics



fun main() {

//    val shoppingList = listOf("Processor","RAM","Graphics Card", "SSD")
    val shoppingList = mutableListOf<String>("Processor","RAM","Graphics Card RTX 3060", "SSD")

    println(shoppingList)

    shoppingList.add("Cooling System")
    shoppingList.remove("Graphics Card RTX 3060")
    shoppingList.add("Graphics Card RTX 4090")
    shoppingList[4] = "Graphics Card RX 7950XT"
//    println(shoppingList)
    println(shoppingList.contains("RAM"))

//    for(item in shoppingList) {
//        println(item)
//    }

    for(index in 0 until shoppingList.size){
        println(shoppingList[index])
    }

//    val coffeeForBen = CoffeeDetails(0, "ben", "xxl", 0)
//    makeCoffee(coffeeForBen)
//    var daisy = Dog("Daisy","Dwarf Poodle", 3)
//    println(daisy.bark())
//    println(daisy.age)
//    daisy.age = 12
//    println(daisy.age)
//    var myBook = Book()
//    println(myBook.title)
//    println(myBook.author)
//    println(myBook.yearPublished)
//
//    var customBook = Book("The Economy","Denis Bloomberg", 2023  )
//    println(customBook.title)
//    println(customBook.author)
//    println(customBook.yearPublished)
}

/*
data class CoffeeDetails(
    val sugarCount: Int, val name: String, val size: String, val creamAmount: Int
)
fun makeCoffee(coffeeDetails: CoffeeDetails) {
    if (coffeeDetails.sugarCount == 1) {
        println("Coffee with ${coffeeDetails.sugarCount} spoon of sugar for ${coffeeDetails.name} and cream ${coffeeDetails.creamAmount}")
    } else if (coffeeDetails.sugarCount == 0) {
        println("Coffee with no sugar for ${coffeeDetails.name} and cream ${coffeeDetails.creamAmount}")
    } else {
        println("Coffee with ${coffeeDetails.sugarCount} spoons of sugar for ${coffeeDetails.name} and cream ${coffeeDetails.creamAmount}")
    }
}
*/
