package chapter14


fun main() {
    orderIceCream(PigBar())
}

private fun orderIceCream(iceCream: IceCream) {
    when (iceCream) {
        is PigBar -> println("돼지바 구매")
        is DoubleBianco -> println("더블비얀코 구매")
    }
}

sealed class IceCream(
    val name: String,
    val price: Int
)

class PigBar : IceCream("돼지바", 800)

class DoubleBianco : IceCream("더블비얀코", 1200)