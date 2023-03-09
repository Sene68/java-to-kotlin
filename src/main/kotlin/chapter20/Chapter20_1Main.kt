package chapter20

fun main() {
    val numbers = listOf(12312,34543,3,21,1,22)

    // let
    numbers.map { it }
        .filter { it > 3 }
        .let { numbers -> println(numbers) }
}