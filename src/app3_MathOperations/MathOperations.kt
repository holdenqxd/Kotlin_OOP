package src.app3_MathOperations

class MathOperations {
    fun add(num1: Number, num2: Number): Double {
        return when {
            num1 is Number.IntNumber && num2 is Number.IntNumber -> (num1.value + num2.value).toDouble()
            num1 is Number.DoubleNumber && num2 is Number.DoubleNumber -> num1.value + num2.value
            else -> throw IllegalArgumentException("Некорректная операция")
        }
    }

    fun subtract(num1: Number, num2: Number): Double {
        return when {
            num1 is Number.IntNumber && num2 is Number.IntNumber -> (num1.value - num2.value).toDouble()
            num1 is Number.DoubleNumber && num2 is Number.DoubleNumber -> num1.value - num2.value
            else -> throw IllegalArgumentException("Некорректная операция")
        }
    }

    fun multiply(num1: Number, num2: Number): Double {
        return when {
            num1 is Number.IntNumber && num2 is Number.IntNumber -> (num1.value * num2.value).toDouble()
            num1 is Number.DoubleNumber && num2 is Number.DoubleNumber -> num1.value * num2.value
            else -> throw IllegalArgumentException("Некорректная операция")
        }
    }

    fun divide(num1: Number, num2: Number): Double {
        return when {
            num1 is Number.IntNumber && num2 is Number.IntNumber -> (num1.value.toDouble() / num2.value)
            num1 is Number.DoubleNumber && num2 is Number.DoubleNumber -> num1.value / num2.value
            else -> throw IllegalArgumentException("Некорректная операция")
        }
    }
}