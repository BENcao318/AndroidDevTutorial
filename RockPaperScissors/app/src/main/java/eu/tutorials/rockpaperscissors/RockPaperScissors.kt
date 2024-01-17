package eu.tutorials.rockpaperscissors

import androidx.compose.ui.text.toLowerCase

fun main() {

    var computerChoice = ""
    var playerChoice = ""

    while(true){
        println("rock, paper or scissors? Enter your choice!")
        playerChoice = readln().lowercase()
        if(playerChoice == "rock" || playerChoice == "paper" || playerChoice == "scissors"){
            break
        }
    }

    when ((1..3).random()) {
        1 -> {
            computerChoice = "rock"
        }
        2 -> {
            computerChoice = "paper"
        }
        3 -> {
            computerChoice = "scissors"
        }
    }

    println(computerChoice)

    val winner = when {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "rock" && computerChoice == "scissors" -> "Player"
        playerChoice == "paper" && computerChoice == "rock" -> "Player"
        playerChoice == "scissors" && computerChoice == "paper" -> "Player"
        else -> "Computer"
    }

    if(winner == "Tie") {
        println("It's a tie")
    } else {
        println("$winner won!")
    }


}