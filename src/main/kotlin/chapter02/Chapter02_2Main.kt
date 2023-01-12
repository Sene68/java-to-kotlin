package chapter02

fun main() {
    val string1: String? = "Apple"
    val string2: String? = null
    val string3: String? = "Banana"

    val resultA11 = startsWithA(string1)
    //val resultA12 = startsWithA(string2)
    val resultA13 = startsWithA(string3)

    println("resultA11 : $resultA11")
    //println("resultA12 : $resultA12")
    println("resultA13 : $resultA13")
}


/**
 * The !! Operator
 * the not-null assertion operator (!!)
 */
fun startsWithA(str: String?): Boolean {
    return str!!.startsWith("A")
}