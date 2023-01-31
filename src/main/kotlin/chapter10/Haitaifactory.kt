package chapter10

fun main() {
    val honeyButterChip = Haitaifactory("HoneyButterChip")
    honeyButterChip.make()
    honeyButterChip.getPrice()
}

class Haitaifactory(
    name: String
) : Snack(name, 500) {

    private val nitrogenValue: Int = 10

    override fun make() {
        println("Make Honey Butter Chip")
    }

    fun getPrice() {
        println(this.price)
    }

    override val price: Int
        get() = super.price * this.nitrogenValue
}