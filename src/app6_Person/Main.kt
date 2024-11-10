package src.app6_Person

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