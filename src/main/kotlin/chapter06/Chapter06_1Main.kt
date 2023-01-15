package chapter06

fun main() {
    getNumberWithForEach()
    getNumberWithForPlus()
    getNumberWithForMinus()
}

/**
 * Java Code
 * public void getNumberWithForEach() {
 *  List<Long> numbers = Arrays.asList(1L, 2L, 3L);
 *  for (long number : numbers) {
 *      System.out.println(number);
 *  }
 * }
 */
fun getNumberWithForEach() {
    val numbers = listOf(1, 2, 3)
    for (number in numbers)
        println(number)
}


/**
 * Java Code
 * public void getNumberWithForPlus() {
 *  for (int i = 1; i <= 3; i++) {
 *      System.out.println(i);
 *  }
 * }
 */
fun getNumberWithForPlus() {
    for (i in 1..3)
        println(i)
}

/**
 * Java Code
 * public void getNumberWithForMinus() {
 *  for (int i = 3; i >= 1; i--) {
 *      System.out.println(i);
 *  }
 * }
 */
fun getNumberWithForMinus() {
    for (i in 3 downTo 1)
        println(i)
}