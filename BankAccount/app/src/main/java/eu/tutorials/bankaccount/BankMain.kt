package eu.tutorials.bankaccount

fun main() {
    val bensBankAccount = BankAccount("Ben", 1606960606.01)

    bensBankAccount.deposit(20000.0)
    bensBankAccount.withdraw(20000.0)
    bensBankAccount.deposit(300000.0)

    bensBankAccount.displayTransactionHistory()
    println("${bensBankAccount.accountHolder}'s balance is $${bensBankAccount.acctBalance()}")
    println("\n")

    val sarahsBankAccount = BankAccount("Sarah", 0.0)
    sarahsBankAccount.deposit(100.0)
    sarahsBankAccount.withdraw(10.0)
    sarahsBankAccount.deposit(300.0)

    sarahsBankAccount.displayTransactionHistory()
    println("${sarahsBankAccount.accountHolder}'s balance is $${sarahsBankAccount.acctBalance()}")
}