package src.app1__Person

fun main() {
    val inputHandler = InputHandler()
    val peopleManager = PeopleManager()

    val n = inputHandler.getNumberOfPeople()

    for (i in 1..n) {
        val name = inputHandler.getPersonName()
        val person = Person() // Создаем нового человека
        person.setName(name) // Устанавливаем имя
        peopleManager.addPerson(person) // Добавляем человека в менеджер
    }

    peopleManager.printAllNames() // Печатаем все имена
}