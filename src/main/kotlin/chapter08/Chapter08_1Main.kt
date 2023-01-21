package chapter08

fun main() {
    println(compareAB(20, 40))
}


/**
 * Java Code
 * public int compareAB(int a, int b) {
 *  if (a > b)
 *      return a;
 *
 *  return b;
 * }
 */
fun compareAB(a: Int, b: Int) = if (a > b) a else b