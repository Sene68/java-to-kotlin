package chapter16

fun main() {
    println(10.addValue(4))
    println(20 multiplyValue 3)
}

fun Int.addValue(adder: Int): Int {
    return this + adder
}

infix fun Int.multiplyValue(multiplyValue: Int): Int {
    return this * multiplyValue
}