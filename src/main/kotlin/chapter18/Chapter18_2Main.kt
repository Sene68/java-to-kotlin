package chapter18

fun main() {
    val graphicsCards = listOf(
        GraphicsCard(0, "Geforce GTX 1060", 230000),
        GraphicsCard(1, "Radeon 5300", 660000),
    )

    val map1: Map<String, List<GraphicsCard>> = graphicsCards.groupBy { graphicsCard -> graphicsCard.name }

    println(map1)

    val map2: Map<Long, GraphicsCard> = graphicsCards.associateBy { graphicsCard -> graphicsCard.id }

    println(map2)
}