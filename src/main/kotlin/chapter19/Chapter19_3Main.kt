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

    //label1
    label1()

    //label2
    label2()

}

fun label1() {
    loop@ for (i in 1..10) {
        for (j in 1..10) {
            if (j == 3)
                break@loop
            println("$i and $j")
        }
    }
}

fun label2() {
    loopi@ for (i in 1..10) {
        loopj@for (j in 1..10) {
            if (j == 3)
                break@loopj
            println("$i and $j")
        }
    }
}