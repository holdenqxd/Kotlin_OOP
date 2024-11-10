package src.app1__Person

class InputHandler {
    fun getNumberOfPeople(): Int {
        println("Введите количество людей:")
        return readLine()!!.toInt()
    }

    fun getPersonName(): String {
        println("Введите имя человека:")
        return readLine()!!
    }
}