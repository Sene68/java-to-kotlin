package chapter02

fun main () {
    val string1: String? = "Apple"
    val string2: String? = null
    val string3: String? = "Banana"

    val resultA11 = startsWithA11(string1)
    //val resultA12 = startsWithA1(string2)
    val resultA13 = startsWithA11(string3)

    println("resultA11 : $resultA11")
    //println("resultA1_2 : $resultA12")
    println("resultA13 : $resultA13")

    val resultA21 = startsWithA21(string1)
    val resultA22 = startsWithA21(string2)
    val resultA23 = startsWithA21(string3)

    println("resultA21 : $resultA21")
    println("resultA22 : $resultA22")
    println("resultA23 : $resultA23")

    val resultA31 = startsWithA31(string1)
    val resultA32 = startsWithA31(string2)
    val resultA33 = startsWithA31(string3)

    println("resultA31 : $resultA31")
    println("resultA32 : $resultA32")
    println("resultA33 : $resultA33")
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
fun startsWithA11(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("str is null")
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
fun startsWithA21(str: String?): Boolean? {
    return str?.startsWith("A")
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
fun startsWithA31(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}