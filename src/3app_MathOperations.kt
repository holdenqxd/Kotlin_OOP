class MathOperations {
    fun add(num1: Any, num2: Any): Double {
        return when {
            num1 is Int && num2 is Int -> (num1 + num2).toDouble()
            num1 is Double && num2 is Double -> num1 + num2
            else -> throw IllegalArgumentException("Некорректная операция")
        }
    }

    fun subtract(num1: Any, num2: Any): Double {
        return when {
            num1 is Int && num2 is Int -> (num1 - num2).toDouble()
            num1 is Double && num2 is Double -> num1 - num2
            else -> throw IllegalArgumentException("Некорректная операция")
        }
    }

    fun multiply(num1: Any, num2: Any): Double {
        return when {
            num1 is Int && num2 is Int -> (num1 * num2).toDouble()
            num1 is Double && num2 is Double -> num1 * num2
            else -> throw IllegalArgumentException("Некорректная операция")
        }
    }

    fun divide(num1: Any, num2: Any): Double {
        return when {
            num1 is Int && num2 is Int -> (num1.toDouble() / num2).toDouble()
            num1 is Double && num2 is Double -> num1 / num2
            else -> throw IllegalArgumentException("Некорректная операция")
        }
    }
}

fun main() {
    println("Введите первое число:")
    val num1 = readLine()!!.toDouble()

    println("Введите второе число:")
    val num2 = readLine()!!.toDouble()

    println("Введите тип операции (add, subtract, multiply, divide):")
    val operation = readLine()!!.trim()

    val mathOperations = MathOperations()
    val result: Double

    result = when (operation) {
        "add" -> mathOperations.add(num1, num2)
        "subtract" -> mathOperations.subtract(num1, num2)
        "multiply" -> mathOperations.multiply(num1, num2)
        "divide" -> mathOperations.divide(num1, num2)
        else -> throw IllegalArgumentException("Некорректная операция")
    }

    println("Результат: $result")
}