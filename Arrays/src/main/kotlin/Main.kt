fun main() {
    val names = arrayOf("Car","Bike","Aeroplane")
    val numbers = arrayOf(2,3,4,5,6,"Holland","Kotlin")
    names[1] = "Boat"
    println(names[1])
    for (i in numbers) {
//        println(i)
        if (i is Int) {
            println(i)
        }
    }


}