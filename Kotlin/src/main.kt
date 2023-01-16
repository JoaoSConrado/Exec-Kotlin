fun main(){
    println("Welcome to the Bytebank")

    val holder = "Conrado"

    val numberAccount: Int = 1000

    var balance: Double = 0.0
    balance = 100 + 2.0
    balance += 200

    println("-------------------------")

    println("Holder: $holder")
    println("Number Account: $numberAccount")
    println("Balance: $balance")

    println("-------------------------")

    if(balance > 0.0) {
        println("Account is positive")
    } else if (balance == 0.0) {
        println("Account is null")
    } else {
        println("Account is negative")
    }
    println("-------------------------")

    for (i in 1..5) {
        println(i)
    }

    println("-------------------------")

    for (i in 5 downTo 1) {
        println(i)
    }

    println("-------------------------")

    for (i in 5 downTo 1 step 2) {
        println(i)
    }

    println("-------------------------")

    var i = 0
    while (i < 5) {
        println("Is Invalid")
        i++
    }




}