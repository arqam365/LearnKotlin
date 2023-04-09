<<<<<<< HEAD
fun main() {
//    showMessage("Arqam")
//    println( sum(3,5,1,8) + 3)
    sum(3,5,1,8,4,5,2)
}

/*fun showMessage(name: String , message: String = sendText()) {
    println("Name = $name and Message is  = $message")
}

fun sendText(): String{
    return "Some Text"
}*/

/*fun sum(a: Int, b: Int, c: Int, d: Int): Int {
    return a + b + c + d
}*/

/*fun sum(vararg numbers: Int): Int {
    var result = 0
    for (number in numbers) {
         result += number
    }

    return result
}*/

fun sum(vararg numbers: Int) {
    numbers.forEach { println(it) }
=======
fun main() {
//    showMessage("Arqam")
//    println( sum(3,5,1,8) + 3)
    sum(3,5,1,8,4,5,2)
}

/*fun showMessage(name: String , message: String = sendText()) {
    println("Name = $name and Message is  = $message")
}

fun sendText(): String{
    return "Some Text"
}*/

/*fun sum(a: Int, b: Int, c: Int, d: Int): Int {
    return a + b + c + d
}*/

/*fun sum(vararg numbers: Int): Int {
    var result = 0
    for (number in numbers) {
         result += number
    }

    return result
}*/

fun sum(vararg numbers: Int) {
    numbers.forEach { println(it) }
>>>>>>> 331f795802ec90069a7edd331b3305484b3949b7
}