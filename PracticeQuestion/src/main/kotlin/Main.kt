// Write a program that takes an integer input from the user and prints "Even" if the input is an even number, and "Odd" if the input is an odd number.

/*fun main() {
    println("Enter the number: ")
    val num = readlnOrNull()?.toIntOrNull()
    if (num != null) {
        if (num % 2 == 0) {
            println("Even")
        } else {
            println("Odd")
        }

    }
}*/

// Write a program that takes a floating-point number as input from the user and prints "Positive" if the number is greater than zero, "Negative" if the number is less than zero, and "Zero" if the number is equal to zero.

/*fun main() {
    println("Enter the value: ")
    val num = readln().toFloatOrNull()
    if (num != null) {
        if (num > 0) {
            println("Positive")
        } else if (num < 0) {
            println("Negative")
        } else {
            println("Zero")
        }
    } else {
        println("Invalid")
    }
}*/

// Write a program that takes three integer inputs from the user and prints the largest number.

/*fun main() {
    println("Enter three numbers: ")
    val num1 = readln().toIntOrNull()
    val num2 = readln().toIntOrNull()
    val num3 = readln().toIntOrNull()
    if (num1 != null && num2 != null && num3 != null) {
        if (num1 > num2) {
            if (num1 > num3) {
                println(num1)
            }
            else {
                println(num2)
            }
        }
        else {
            if (num2 > num3) {
                println(num2)
            }
            else {
                println(num3)
            }
        }
    }
}*/

// Write a program that takes an integer input from the user and prints "Leap Year" if the input is a leap year, and "Not a Leap Year" if the input is not a leap year. (A leap year is a year that is divisible by 4, but not divisible by 100 unless it is also divisible by 400).

/*fun main() {
    print("Enter the year: ")
    val year = readln().toIntOrNull()
    if (year != null){
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            println("Leap Year")
        }
        else {
            println("Not a Leap Year")
        }
    }
}*/

// Write a program that takes an integer input from the user and prints "Prime" if the input is a prime number, and "Not Prime" if the input is not a prime number. (A prime number is a number that is only divisible by 1 and itself).

fun main() {
    print("Enter the number: ")
    val value = readln().toIntOrNull()
    if (value != null){
        
    }
}