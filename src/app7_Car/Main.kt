package src.app7_Car

fun main() {
    println("Введите количество автомобилей:")
    val numberOfCars = readLine()!!.toInt()

    for (i in 1..numberOfCars) {
        println("Введите марку и год выпуска автомобиля (через пробел):")
        val input = readLine()!!.split(" ")
        val brand = input[0]
        val year = input[1].toInt()

        val car = Car(brand, year)
        car.printDetails()
    }
}