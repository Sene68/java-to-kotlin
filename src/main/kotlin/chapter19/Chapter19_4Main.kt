package chapter19

fun main() {
    println(getNumberOrNull(0))
    println(getNumberOrNull(100))

    println(getTrueOrNull(false))
    println(getTrueOrNull(true))
}

fun getNumberOrNull(number: Int?): Int? {
    return number.takeIf { it!! > 0 }
}

fun getTrueOrNull(boolean: Boolean): Boolean? {
    return boolean.takeUnless { !it }
}