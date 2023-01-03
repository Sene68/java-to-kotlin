package chapter03

fun main() {
    println(printStringFormat())
    println(printTrimIndent())
    println(printStringIndexing())
}


/**
 * Java Code
 * Animal animal = new Animal("cat",15);
 * String log = String.format("Animal name : %s and age : %s", animal.getName(), animal.getAge());
 */
fun printStringFormat(): String {
    val animal = Animal("cat", 15)

    return "Animal name : ${animal.name} and age : ${animal.age}"
}

/**
 * Java Code
 * String message = """
 *      ABC
 *      123
 *      cat
 *      """;
 */
fun printTrimIndent() : String {
    val animal = Animal("cat", 15)
    return """
        ABC
        123
        ${animal.name}
    """.trimIndent()
}

/**
 * Java Code
 * String str = "SENE68";
 * char ch = str.charAt(1);
 */
fun printStringIndexing(): Char {
    val str = "SENE68"
    return str[1]
}