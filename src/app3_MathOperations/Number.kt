package src.app3_MathOperations

sealed class Number {
    data class IntNumber(val value: Int) : Number()
    data class DoubleNumber(val value: Double) : Number()
}

