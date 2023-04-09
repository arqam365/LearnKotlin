// Using While Loop and function

//fun main() {
//    var num: Int = 0
//    var evenNumCounter = 0
//    while (num <= 20) {
//        num++
//
//        if (!isEvenNum(num)) {
//            continue
//        }
//
//        evenNumCounter++
//        println(num)
//    }
//    println(evenNumCounter)
//}
//
//fun isEvenNum(number: Int): Boolean {
//    if ((number % 2) == 0) {
//        return true
//    } else {
//        return false
//    }
//}


// Using while loop

/*fun main(){
    var num=0
    while (num<=20){
        num++
        if (num % 2 != 0) {
            continue
        }
        println(num)
    }
}*/
// using for loop

fun main() {
    for (i in 1..20) {
        if (i % 2 != 0 ) {
            continue
        }
        println(i)
    }
}