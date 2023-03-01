package chapter18

fun main() {
    val graphicsCards = listOf(
        listOf(
            GraphicsCard(0, "Geforce GTX 1060", 230000),
            GraphicsCard(1, "Radeon 5300", 660000),
        ),
        listOf(
            GraphicsCard(2, "Geforce GTX 2070", 430000),
            GraphicsCard(3, "Radeon 3300", 160000),
        ),
        listOf(
            GraphicsCard(4, "Geforce GTX 3080", 1430000),
            GraphicsCard(5, "Radeon 4300", 360000),
        )
    )

    val radeonGraphicsCards = graphicsCards.flatMap { list ->
        list.filter { graphicsCard -> graphicsCard.name.contains("Radeon") }
    }

    println(radeonGraphicsCards)

    val graphicsCardsFlatten = graphicsCards.flatten()

    println(graphicsCardsFlatten)
}