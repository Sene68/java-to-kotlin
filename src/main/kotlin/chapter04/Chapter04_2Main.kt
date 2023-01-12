package chapter04

fun main() {

    printDistanceInstance()
    printDistanceValue()
}

/**
 * Java Code
 * Distance x1 = new Distance(1_000L);
 * Distance x2 = x1;
 * Distance x3 = new Distance(1_000L);
 *
 * System.out.println(x1 == x2)
 * System.out.println(x1 == x3)
 */
fun printDistanceInstance() {
    val x1 = Distance(1_000L)
    val x2 = x1
    val x3 = Distance(1_000L)

    println(x1 === x2)
    println(x1 === x3)
}

/**
 * Java Code
 * Distance x1 = new Distance(1_000L);
 * Distance x2 = x1;
 * Distance x3 = new Distance(1_000L);
 *
 * System.out.println(x1.equals(x2))
 * System.out.println(x1.equals(x3))
 */
fun printDistanceValue() {
    val x4 = Distance(123)
    val x5 = x4
    val x6 = Distance(123)

    println(x4.x == x5.x)
    println(x4.x == x6.x)
}

class Distance(val x: Long)