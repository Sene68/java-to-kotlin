package chapter15

fun main() {

    val numbersList = listOf(100, 200)

    printNumberIndexOfList(numbersList, 0)
    printNumberForEachOfList(numbersList)
    printNumberForLoopOfList(numbersList)

    val numbersSet = setOf(300,400)
    printNumberIndexOfSet(numbersSet, 1)
    printNumberForEachOfSet(numbersSet)
    printNumberForLoopOfSet(numbersSet)

    val numbersMap = mutableMapOf<Int, Int>()
    numbersMap[0] = 500
    numbersMap[1] = 600
    printNumberForOfMap(numbersMap)

    val numbersMapOf = mapOf(0 to 700, 1 to 800)
    printNumberForOfMap(numbersMapOf)
}


/**
 * Java Code
 * List<Integer> numbers = Array.asList(100, 200);
 * System.out.println(numbers.get(0));
 */
private fun printNumberIndexOfList(numbers: List<Int>, idx: Int) {
    println(numbers[idx])
}

private fun printNumberIndexOfSet(numbers: Set<Int>, idx: Int) {
    println(numbers.elementAt(idx))
}


/**
 * Java Code
 * List<Integer> numbers = Array.asList(100, 200);
 * for (int number : numbers) {
 *  System.out.println(number);
 * }
 */
private fun printNumberForEachOfList(numbers: List<Int>) {
    for (number in numbers) {
        println(number)
    }
}

private fun printNumberForEachOfSet(numbers: Set<Int>) {
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
private fun printNumberForLoopOfList(numbers: List<Int>) {
    for ((idx, value) in numbers.withIndex()) {
        println("$idx $value")
    }
}

private fun printNumberForLoopOfSet(numbers: Set<Int>) {
    for ((idx, value) in numbers.withIndex()) {
        println("$idx $value")
    }
}

/**
 * Java Code
 * Map<Integer, Integer> numbers = new HashMap<>();
 * numbers.put(0, 500)
 * numbers.put(1, 600)
 *
 * for (int key : numbers.keySet()) {
 *  System.out.println(numbers.get(key));
 * }
 */
private fun printNumberForOfMap(numbers: Map<Int, Int>) {
    for (key in numbers.keys) {
        println(numbers[key])
    }
}