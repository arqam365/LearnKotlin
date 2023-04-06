fun main() {
    var text: String? = null
    text = "null"
//    if (text != null){
//        println(text.length)
//    } else {
//        println("This is null value")
//    }

    val text2: String = text ?: "This is null value"

    println(text2)
}