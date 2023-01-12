package chapter02

fun main() {
    val string1: String? = "Apple"
    val string2: String? = null
    val string3: String? = "Banana"

    val resultA11 = startsWithA1(string1)
    //val resultA12 = startsWithA1(string2)
    val resultA13 = startsWithA1(string3)

    println("resultA1_1 : $resultA11")
    //println("resultA1_2 : $resultA12")
    println("resultA1_3 : $resultA13")

    val resultA21 = startsWithA2(string1)
    val resultA22 = startsWithA2(string2)
    val resultA23 = startsWithA2(string3)

    println("resultA2_1 : $resultA21")
    println("resultA2_2 : $resultA22")
    println("resultA2_3 : $resultA23")

    val resultA31 = startsWithA3(string1)
    val resultA32 = startsWithA3(string2)
    val resultA33 = startsWithA3(string3)

    println("resultA3_1 : $resultA31")
    println("resultA3_2 : $resultA32")
    println("resultA3_3 : $resultA33")
}


/**
 * Java Code
 * public boolean startsWithA1(String str) {
 *   if (str == null)
 *      throw new IllegalArgumentException("str is null")
 *
 *   return str.startsWith("A")
 * }
 */
fun startsWithA1(str: String?): Boolean {
    if (str == null)
        throw IllegalArgumentException("str is null")

    return str.startsWith("A")
}

/**
 * Java Code
 * public Boolean startsWithA2(String str) {
 *   if (str == null)
 *      return null
 *
 *   return str.startsWith("A")
 * }
 */
fun startsWithA2(str: String?): Boolean? {
    if (str == null)
        return null

    return str.startsWith("A")
}

/**
 * Java Code
 * public boolean startsWithA3(String str) {
 *   if (str == null)
 *      return false
 *
 *   return str.startsWith("A")
 * }
 */
fun startsWithA3(str: String?): Boolean {
    if (str == null)
        return false

    return str.startsWith("A")
}