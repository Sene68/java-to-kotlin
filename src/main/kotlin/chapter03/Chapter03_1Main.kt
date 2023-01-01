package chapter03

/**
 * Java Code
 * int number1 = 4;
 * long number2 = number1;
 */
fun main() {
    // type casting
    val number1 = 3
    val number2: Long = number1.toLong()
    val number3 = number1 + number2

    println("number2 : $number2")
    println("number3 : $number3")

    // nullable type casting
    val number4: Int? = 5
    val number5: Long = number4?.toLong() ?: 0
    val number6 = number4?.plus(number5)

    println("number5 : $number5")
    println("number6 : $number6")
}