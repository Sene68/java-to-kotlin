package chapter19

fun main() {
    //forEach
    val numbers = listOf(1, 2, 3, 4, 5)
    numbers.map { number -> number + 1 }
        .forEach { number -> println(number) }

    //forEach break
    run {
        numbers.forEach { number ->
            if (number == 3)
                return@run
            println(number)
        }
    }

    //forEach continue
    numbers.forEach { number ->
        if (number == 3)
            return@forEach
        println(number)
    }
}