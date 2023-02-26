package chapter18

fun main() {
    val graphicsCards = listOf(
        GraphicsCard(0, "Geforce GTX 1060", 230000),
        GraphicsCard(1, "Radeon 5300", 660000),
    )

    val radeonPrices = graphicsCards.filter { graphicsCard -> graphicsCard.name == "Radeon 5300" }
        .map { graphicsCard -> graphicsCard.price}

    println(radeonPrices)

    val isAllGTX = graphicsCards.all { graphicsCard -> graphicsCard.name.contains("GTX") }

    println(isAllGTX)
}

data class GraphicsCard (
    val id: Long,
    val name: String,
    val price: Long,
)