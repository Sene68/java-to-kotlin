package chapter05

fun main() {
    println(getGradeWithSwitch(6))
}

/**
 * Java Code
 * public String getGradeWithSwitch(int score) {
 *  switch (score / 10) {
 *      case 9:
 *          return "A";
 *      case 8:
 *          return "B";
 *      case 7:
 *          return "C";
 *      case 6:
 *          return "D";
 *      default:
 *          return "E";
 *  }
 * }
 */
fun getGradeWithSwitch(num: Int): String {
    return when (num) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        6 -> "D"
        else -> "E"
    }
}