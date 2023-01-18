package chapter07

fun main() {
    println(parseIntOrThrow("2"))
    println(parseIntOrNull("3"))
    println(parseIntOrNull("str"))
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


/**
 * Java Code
 * public int parseIntOrNull(@NotNull String str) {
 *  try {
 *      return Integer.parseInt(str);
 *  } catch (NumberFormatException e) {
 *      return null;
 *  }
 * }
 */
fun parseIntOrNull(str: String) : Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}