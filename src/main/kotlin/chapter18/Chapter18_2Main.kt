package chapter18

fun main() {
    val graphicsCards = listOf(
        GraphicsCard("Geforce GTX 1060", 230000),
        GraphicsCard("Radeon 5300", 660000),
    )

    val map1: Map<String, List<GraphicsCard>> = graphicsCards.groupBy { graphicsCard -> graphicsCard.name }

    println(map1)
}