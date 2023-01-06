package chapter04

fun main() {
    printOperatorOverloading()
}

/**
 * Java Code
 *
 * public class Point implements Comparable<Point> {
 *
 *  private final long x;
 *
 *  public Point(int x) {
 *      this.x = x;
 *  }
 *
 *  public Point plus(Point other) {
 *      return new Point(this.x + other.x);
 *  }
 * }
 */
fun printOperatorOverloading() {
    val p1 = Point(1)
    val p2 = Point(2)

    println(p1 + p2)
}

data class Point(val x: Int)
operator fun Point.plus(other: Point) = Point(x + other.x)