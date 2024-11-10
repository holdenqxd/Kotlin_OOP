package src.app6_Person

class Admin(name: String) : Personav(name, "Admin") {
    override fun showInfo() {
        println("Имя: $name, Роль: Администратор")
    }
}