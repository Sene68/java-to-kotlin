package chapter16

fun main() {
    println(10.addValue(4))
    println(20 multiplyValue 3)
    println(30.minusValue(10))
    printDivideValue(100, 30)
}

fun Int.addValue(adder: Int): Int {
    return this + adder
}

infix fun Int.multiplyValue(multiplyValue: Int): Int {
    return this * multiplyValue
}

inline fun Int.minusValue(minusValue: Int): Int {
    return this - minusValue
}

fun printDivideValue(value1: Int, value2: Int) {
    fun divide(): Int = value1 / value2
    val result = divide()
    println(result)
}