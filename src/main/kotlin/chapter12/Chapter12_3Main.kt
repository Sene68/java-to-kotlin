package chapter12

fun main() {
    printSomething(object: Printable {
        override val content: String
            get() = "Bye Kotlin"

        override fun print(): String {
            return "Hello Kotlin"
        }
    })

}

private fun printSomething(printable: Printable) {
    printable.print()
    printable.content
}