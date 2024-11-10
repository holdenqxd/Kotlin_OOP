package src.app1__Person

class PeopleManager {
    private val people = mutableListOf<Person>()

    fun addPerson(person: Person) {
        people.add(person)
    }

    fun printAllNames() {
        println("Список:")
        for (person in people) {
            person.printName()
        }
    }
}