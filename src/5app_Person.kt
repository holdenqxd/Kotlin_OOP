open class Personav(val name: String, val role: String) {
    open fun showInfo() {
        println("Имя: $name, Роль: $role")
    }
}

class Moderator(name: String) : Personav(name, "Moderator") {
    override fun showInfo() {
        println("Имя: $name, Роль: Модератор")
    }
}

class Admin(name: String) : Personav(name, "Admin") {
    override fun showInfo() {
        println("Имя: $name, Роль: Администратор")
    }
}

fun main() {
    println("Введите имя и роль пользователя (Moderator или Admin):")
    val name = readLine()!!
    val role = readLine()!!

    val user: Personav = when (role) {
        "Moderator" -> Moderator(name)
        "Admin" -> Admin(name)
        else -> Personav(name, role)
    }

    user.showInfo()
}