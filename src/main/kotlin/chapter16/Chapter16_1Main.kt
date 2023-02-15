package chapter16

fun main() {
    val price = 9000
    println(price.valueAddedTax())
}

fun Int.valueAddedTax(): Double {
    return this * 1.1
}