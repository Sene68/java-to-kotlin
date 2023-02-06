package chapter13

fun main() {

}

class AnimalHouse(
    private val name: String,
    private val price: Price,
) {
    class Price(
        private val sqft: Double
    )
}