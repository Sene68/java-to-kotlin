package chapter05

fun main() {
    val resultAorB = getAorB(1000)
    println(resultAorB)

    val resultGrade = getGrade(30)
    println(resultGrade)

    val resultRanges = getCorD(230)
    println(resultRanges)
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

/**
 * Java Code
 * public String getCorD(int num) {
 *  if (num >= 0 && num <= 30) {
 *      return "C";
 *  } else {
 *      return "D";
 *  }
 * }
 */
fun getCorD(num: Int): String {
    return if (num in 0..30) {
        return "C"
    } else {
        return "D"
    }
}