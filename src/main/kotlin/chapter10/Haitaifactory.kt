package chapter10

fun main() {
    val honeyButterChip = Haitaifactory("HoneyButterChip")
    honeyButterChip.make()
    honeyButterChip.getPrice()

    honeyButterChip.act()
}

class Haitaifactory(
    name: String
) : Snack(name, 500), Cream, Knead {

    private val nitrogenValue: Int = 10

    override fun make() {
        println("Make Honey Butter Chip")
    }

    fun getPrice() {
        println(this.price)
    }

    override val price: Int
        get() = super.price * this.nitrogenValue

    override fun act() {
        super<Knead>.act()
        super<Cream>.act()
    }

}