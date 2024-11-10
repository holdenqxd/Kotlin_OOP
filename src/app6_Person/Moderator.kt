package src.app6_Person

class Moderator(name: String) : Personav(name, "Moderator") {
    override fun showInfo() {
        println("Имя: $name, Роль: Модератор")
    }
}