package chapter19

fun main() {
    val shoes = Shoes("Airmax 90", 98000)
    val (name, price) = shoes
    println("name : ${name}, price : $price")
}

data class Shoes(
  val name: String,
  val price: Long
)