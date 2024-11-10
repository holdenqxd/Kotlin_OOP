package src.app2_person

open class Person(private var name: String) {
    fun setName(newName: String) {
        name = newName
    }

    fun printName() {
        println("Name: $name")
    }
}