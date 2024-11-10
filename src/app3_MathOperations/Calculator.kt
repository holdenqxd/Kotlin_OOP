package src.app3_MathOperations

class Calculator {
    private val mathOperations = MathOperations()

    fun start() {
        println("Введите первое число:")
        val num1 = readLine()!!.toDouble()
        val number1 = if (num1 % 1.0 == 0.0) Number.IntNumber(num1.toInt()) else Number.DoubleNumber(num1)

        println("Введите второе число:")
        val num2 = readLine()!!.toDouble()
        val number2 = if (num2 % 1.0 == 0.0) Number.IntNumber(num2.toInt()) else Number.DoubleNumber(num2)

        println("Введите тип операции (add, subtract, multiply, divide):")
        val operation = readLine()!!.trim()

        val result: Double = when (operation) {
            "add" -> mathOperations.add(number1, number2)
            "subtract" -> mathOperations.subtract(number1, number2)
            "multiply" -> mathOperations.multiply(number1, number2)
            "divide" -> mathOperations.divide(number1, number2)
            else -> throw IllegalArgumentException("Некорректная операция")
        }

        println("Результат: $result")
    }
}