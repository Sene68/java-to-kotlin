package chapter06

fun main() {
    getNumberWithForEach()
    getNumberWithFor()
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
 * public void getNumberWithFor() {
 *  for (int i = 1; i <= 3; i++) {
 *      System.out.println(i);
 *  }
 * }
 */
fun getNumberWithFor() {
    for (i in 1..3) {
        println(i)
    }
}