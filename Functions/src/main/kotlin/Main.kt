<<<<<<< HEAD
/*fun main() {
//    greet("World", 19)
    val hasInternetConnection = false
    if (hasInternetConnection){
        getData("some data")
    }else {
        showMessage()
    }
}

//fun greet(name: String, age: Int) {
//    println("Hello, $name! Your age is $age")
//}

fun getData(data: String){
    println("Your data is: $data")
}

fun showMessage(){
    println("There is no internet connection.")
}*/

fun main() {
    val max = getMax(2,5)
    println(max)
}

fun getMax(a: Int , b: Int): Int {
    val max = if (a > b) a else b
    return max
=======
/*fun main() {
//    greet("World", 19)
    val hasInternetConnection = false
    if (hasInternetConnection){
        getData("some data")
    }else {
        showMessage()
    }
}

//fun greet(name: String, age: Int) {
//    println("Hello, $name! Your age is $age")
//}

fun getData(data: String){
    println("Your data is: $data")
}

fun showMessage(){
    println("There is no internet connection.")
}*/

fun main() {
    val max = getMax(2,5)
    println(max)
}

fun getMax(a: Int , b: Int): Int {
    val max = if (a > b) a else b
    return max
>>>>>>> 331f795802ec90069a7edd331b3305484b3949b7
}