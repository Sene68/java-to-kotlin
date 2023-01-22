package chapter08

fun main() {
    repeatMessage("Sene")
    repeatMessage("Java to Kotlin", 2)
    repeatMessage("Haha", 3, false)
}

/**
 * Java Code
 * public void repeatMessage(String str, int num, boolean isNew) {
 *  for (int i = i; i <= num; i++) {
 *      if (isNew) {
 *          System.out.println(str);
 *      } else {
 *          System.out.println("Hello World");
 *      }
 *  }
 * }
 *
 * public void repeatMessage(String str, int num) {
 *  repeatMessage(str, num, true);
 * }
 *
 * public void repeatMessage(String str) {
 *  repeatMessage(str, 4, true);
 * }
 */
fun repeatMessage(
    str: String,
    num: Int = 4,
    isNew: Boolean = true
) {
    for (i in 1..num) {
        if (isNew) {
            println(str)
        } else {
            println("Hello World")
        }
    }
}