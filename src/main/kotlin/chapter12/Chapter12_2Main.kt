package chapter12

fun main() {
    println(Singleton.a)
    Singleton.a += 3000
    println(Singleton.a)
}


object Singleton {
    var a: Int = 0
}