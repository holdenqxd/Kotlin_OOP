package `6app_Animal`

fun main() {
    print("Введите название животного: (dog, cat, bird):")
    val animalName = readLine()!!.lowercase()

    val animal: Animal = when (animalName) {
        "dog" -> Dog()
        "cat" -> Cat()
        "bird" -> Bird()
        else -> throw IllegalArgumentException("Неизвестное животное")
    }

    animal.sound()
}