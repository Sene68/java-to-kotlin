package chapter05

fun main() {
    val resultAorB = getAorB(1000)
    println(resultAorB)
}

/**
 * Java Code
 * public String getAorB(int num) {
 *  if (num >= 100) {
 *      return "A";
 *  } else {
 *      return "B";
 *  }
 * }
 */
fun getAorB(num: Int): String {
    return if (num >= 100) {
        "A"
    } else {
        "B"
    }
}