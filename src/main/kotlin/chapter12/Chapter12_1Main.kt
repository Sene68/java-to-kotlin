package chapter12

fun main() {
    val beer = Beer.newBeer("GooseIsland312")

    println(beer.name)
    println(beer.price)
}

class Beer private constructor(
    var name: String,
    var price: Int,
) {
    companion object {
        private const val DEFAULT_PRICE = 3000
        fun newBeer(name: String) : Beer {
            return Beer(name, DEFAULT_PRICE)
        }
    }
}