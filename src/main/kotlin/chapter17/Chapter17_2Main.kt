package chapter17

fun main () {
    var sum=0
    var listOfInteger= arrayOf (0, 1, 2, 3, 4, 5, 6, 7)
    listOfInteger.forEach {
        sum+=it
        println (sum)
    }
}
