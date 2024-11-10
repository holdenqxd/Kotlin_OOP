package src.app6_Person

open class Personav(val name: String, val role: String) {
    open fun showInfo() {
        println("Имя: name Роль: role")
    }
}