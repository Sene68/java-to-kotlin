package chapter19

fun main() {
    val shoes = Shoes("Airmax 90", 98000)
    val (name, price) = shoes
    println("name : ${name}, price : $price")


    val shoes2 = Shoes("Superstar", 56000)
    val shoesName = shoes2.component1()
    val shoesPrice = shoes2.component2()

    println("name : ${shoesName}, price : $shoesPrice")
}

data class Shoes(
  val name: String,
  val price: Long
)