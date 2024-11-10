package src.app2_person

fun main() {
    println("Введите количество студентов:")
    val n = readLine()!!.toInt()

    val students = mutableListOf<Student>()

    for (i in 1..n) {
        println("Введите имя и идентификатор студента (через пробел):")
        val (name, id) = readLine()!!.split(' ')
        val student = Student(name)
        student.setStudentId(id.toInt())
        students.add(student)
    }

    // Вывод всех студентов
    println("Список студентов:")
    for (student in students) {
        student.printStudentDetails()
    }
}