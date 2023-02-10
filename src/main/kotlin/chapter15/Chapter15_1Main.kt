package chapter15

fun main() {
    printArray()
    printArray2()
}

fun printArray() {
    val array = arrayOf(20, 30)

    for (i in array.indices) {
        println("$i ${array[i]}")
    }
}

fun printArray2() {
    val array = arrayOf(40, 50)

    for ((idx, value) in array.withIndex()) {
        println("$idx $value")
    }
}