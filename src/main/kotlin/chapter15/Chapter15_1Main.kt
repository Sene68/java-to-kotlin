package chapter15

fun main() {
    printArray()
}

fun printArray() {
    val array = arrayOf(20, 30)

    for (i in array.indices) {
        println("$i ${array[i]}")
    }
}