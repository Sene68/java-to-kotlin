package chapter08

fun main() {
    printStrings("Q", "W", "E")

    val array = arrayOf("A", "B", "C")
    printStrings(*array)
}


/**
 * Java Code
 * public static void printStrings(String... strings) {
 *  for (String str : strings) {
 *      System.out.println(str);
 *  }
 * }
 */
fun printStrings(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}