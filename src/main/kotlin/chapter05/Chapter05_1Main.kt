package chapter05

fun main() {
    val resultAorB = getAorB(1000)
    println(resultAorB)

    val resultGrade = getGrade(30)
    println(resultGrade)
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

/**
 * Java Code
 * public String getGrade(int num) {
 *  if (num >= 90) {
 *      return "A";
 *  } else if (num >= 50) {
 *      return "B";
 *  } else {
 *      return "C";
 *  }
 * }
 */
fun getGrade(num: Int): String {
    return if (num >= 90) {
        return "A";
    } else if (num >= 50) {
        return "B";
    } else {
        return "C";
    }
}

