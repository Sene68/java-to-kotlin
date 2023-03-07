package chapter19

fun main() {
    println(getNumberOrNull(0))
    println(getNumberOrNull(100))
}

fun getNumberOrNull(number: Int?): Int? {
    return number.takeIf { it!! > 0 }
}