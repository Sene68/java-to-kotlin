package chapter07

fun main() {
    println(parseIntOrThrow("2"))
}


/**
 * Java Code
 * public int parseIntOrThrow(@NotNull String str) {
 *  try {
 *      return Integer.parseInt(str);
 *  } catch (NumberFormatException e) {
 *      throw new IllegalArgumentException("str is not number")
 *  }
 * }
 */
fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("str is not number")
    }
}