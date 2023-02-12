package chapter15

fun main() {

    val numbers = listOf(100, 200)

    printNumberIndex(numbers, 0)
    printNumberForEach(numbers)
    printNumberForLoop(numbers)

}


/**
 * Java Code
 * List<Integer> numbers = Array.asList(100, 200);
 * System.out.println(numbers.get(0));
 */
private fun printNumberIndex(numbers: List<Int>, idx: Int) {
    println(numbers[idx])
}


/**
 * Java Code
 * List<Integer> numbers = Array.asList(100, 200);
 * for (int number : numbers) {
 *  System.out.println(number);
 * }
 */
private fun printNumberForEach(numbers: List<Int>) {
    for (number in numbers) {
        println(number)
    }
}

/**
 * Java Code
 * List<Integer> numbers = Array.asList(100, 200);
 * for (int i = 0; i < numbers.size(); i++) {
 *  System.out.printf("%s %s", i, numbers.get(i));
 * }
 */
private fun printNumberForLoop(numbers: List<Int>) {
    for ((idx, value) in numbers.withIndex()) {
        println("$idx $value")
    }
}