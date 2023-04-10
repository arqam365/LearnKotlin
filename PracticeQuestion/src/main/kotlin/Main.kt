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

/*fun main() {
    print("Enter the number: ")
    val value = readln().toIntOrNull()
    if (value != null){
        var isPrime = true
        for (i in 2..value/2) {
            if (value % i == 0) {
                isPrime = false
                break
            }
        }
        if (isPrime) {
            println("Prime")
        }
        else {
            println("Not Prime")
        }
    }
}*/

// Write a program that takes two integer inputs from the user and prints the sum, difference, product, and quotient of the two numbers.

/*fun main() {
    print("Enter the first number: ")
    val num1 = readln().toIntOrNull()
    print("Enter the second number: ")
    val num2 = readln().toIntOrNull()
    if (num1 != null && num2 != null) {
        println("Sum: ${num1 + num2}")
        println("Difference: ${num1 - num2}")
        println("Product: ${num1 * num2}")
        println("Quotient: ${num1 / num2}")
    }
}*/

// Write a program that takes a character input from the user and prints "Vowel" if the input is a vowel, and "Consonant" if the input is a consonant.

/*fun main() {
    print("Enter the character: ")
    val char = readln().firstOrNull()
    if (char == 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u'|| char == 'A' || char == 'E' || char == 'I' || char == 'O' || char == 'U') {
        println("Vowel")
    }
    else {
        println("Consonant")
    }
}*/

// Write a program that takes an integer input from the user and prints the factorial of that number?

/*fun main() {
    print("Enter the number: ")
    val num = readln().toIntOrNull()
    if (num != null) {
        var fact = 1
        for (i in 1..num) {
            fact *= i
        }
        println("Factorial of $num is: $fact")
    }
}*/

// Write a program that takes an integer input from the user and prints the Fibonacci series up to that number.

/*fun main() {
    print("Enter the number: ")
    val num = readln().toIntOrNull()
    if (num != null) {
        var first = 0
        var second = 1
        var next = 0
        print("Fibonacci Series: $first $second ")
        for (i in 1..num) {
            next = first + second
            first = second
            second = next
            print("$next ")
        }
    }
}*/

// Write a program that takes two integer inputs from the user and prints "Equal" if the two numbers are equal, "Greater" if the first number is greater than the second number, and "Smaller" if the first number is smaller than the second number.

/*fun main() {
    print("Enter the first number: ")
    val num1 = readln().toIntOrNull()
    print("Enter the second number: ")
    val num2 = readln().toIntOrNull()
    if (num1 != null && num2 != null) {
        if (num1 == num2) {
            println("Equal")
        }
        else if (num1 > num2) {
            println("Greater")
        }
        else {
            println("Smaller")
        }
    }
}*/