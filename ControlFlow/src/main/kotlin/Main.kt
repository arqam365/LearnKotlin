fun main() {


    when(val alarm = 7) {
        12,7,14 -> println("The time is $alarm")
        !in 1..10 -> println("The number is in range 1..10")

        else -> println("The time is $alarm")
    }
}