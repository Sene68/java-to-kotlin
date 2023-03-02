package chapter19

fun main() {
    val word = "level"
    val isPalindrome = isPalindrome(word)
    println(isPalindrome)
}

typealias Palindrome = String

fun isPalindrome(word: Palindrome): Boolean {
    val sb = StringBuilder(word)

    val reverseStr = sb.reverse().toString()

    return word.equals(reverseStr, ignoreCase = true)
}