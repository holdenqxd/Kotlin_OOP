package src.app2_person

class Student(name: String) : Person(name) {
    private var studentId: Int? = null

    fun setStudentId(newId: Int) {
        studentId = newId
    }

    fun printStudentDetails() {
        super.printName()
        println("Student ID: $studentId")
    }
}
