package chapter04

fun main() {
    printCompareNumber()
}

/**
 * Java Code
 * Long obj1 = new Long(123);
 * Long obj2 = new Long(198);
 * int compareValue = obj1.compareTo(obj2)
 *
 * if (compareValue < 0)
 *  System.out.println("object1 is less than object2");
 *
 * if (compareValue > 0)
 *  System.out.println("object1 is greater than object2");
 */
fun printCompareNumber() {
    val obj1: Long = 123
    val obj2: Long = 198

    if (obj1 > obj2)
        println("object1 is greater than object2")

    if (obj1 < obj2)
        println("object1 is less than object2")
}