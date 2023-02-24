package chapter18

fun main() {
    val graphicsCards = listOf(
        GraphicsCard("Geforce GTX 1060", 230000),
        GraphicsCard("Radeon 5300", 660000),
    )

    val radeonPrices = graphicsCards.filter { graphicsCard -> graphicsCard.name == "Radeon 5300" }
        .map { graphicsCard -> graphicsCard.price}

    println(radeonPrices)

    val isAllGTX = graphicsCards.all { graphicsCard -> graphicsCard.name.contains("GTX") }

    println(isAllGTX)
}

data class GraphicsCard (
    val name: String,
    val price: Long,
)