package src.app4_Playable

fun main() {
    println("Введите команду play чтобы классно:")
    val command = readLine()

    if (command == "play") {
        val guitar = Guitar()
        guitar.play()
    } else {
        println("Неверная команда.")
    }
}