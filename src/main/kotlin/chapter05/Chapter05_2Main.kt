package chapter05

fun main() {
    println(getGradeWithSwitch(6))
    println(getGradeRangeWithSwitch(77))
}

/**
 * Java Code
 * public String getGradeWithSwitch(int num) {
 *  switch (num) {
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

fun getGradeRangeWithSwitch(num: Int): String {
    return when (num) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        else -> "E"
    }
}