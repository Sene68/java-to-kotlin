package chapter14

fun main() {
    val animal = AnimalDto("Cat", 10)
    println(animal)
}

data class AnimalDto(
    val name: String,
    val age: Int
)