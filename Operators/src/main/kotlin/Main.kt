fun main() {
    var x = 6
    val y = 4.0

    println(" x + y = ${x + y}")
    println(" x - y = ${x - y}")
    println(" x * y = ${x * y}")
    println(" x / y = ${x / y}")
    println(" x % y = ${x % y}")

    var result = x + y

    result += 2
    println("result = $result")

    result -= 2
    println("result = $result")

    result *= 2
    println("result = $result")

    result /= 2
    println("result = $result")

    result %= 2
    println("result = $result")

    println("\n3 + 4 * 3 = ${3 + 4 * 3}")
    println("\n3 + 4 * 3 = ${ (3 + 4) * 3}")

    x = 0
    println("x = ${x++}\n")
    println("x = ${++x}")
    println("\nx = ${x--}")
    println("x = ${--x}")

    val num = 150

    if (num > 150) {
        println("Greater than 150")
    }
    else if (num > 90) {
        println("Greater than 90")
    }else {
        println("All condition are failed")
    }
}