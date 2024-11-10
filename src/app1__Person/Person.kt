package src.app1__Person

class Person(private var name: String = "") {

    fun setName(newName: String) {
        name = newName
    }

    fun getName(): String {
        return name
    }

    fun printName() {
        println("Имя: $name")
    }
}
