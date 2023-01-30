package chapter10

fun main() {
    val chocoheim = Crownfactory("Chocoheim")
    chocoheim.make()
}

class Crownfactory (
    name: String
) : Snack(name, 300) {

    override fun make() {
        println("Make Chocoheim")
    }
}