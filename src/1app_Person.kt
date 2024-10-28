class Person {
    private var name: String = ""

    fun setName(newName: String) {
        name = newName
    }

    fun printName() {
        println("Имя: $name")
    }
}

fun main() {
    println("Введите количество людей:")
    val n = readLine()!!.toInt()

    val people = mutableListOf<Person>()

    for (i in 1..n) {
        println("Введите имя человека:")
        val name = readLine()!!
        val person = Person()
        person.setName(name)
        people.add(person)
    }

    println("Список:")

    for (person in people) {
        person.printName()
    }
}