package chapter20

fun main() {
    val numbers = listOf(12312,34543,3,21,1,22)

    // let
    numbers.map { it }
        .filter { it > 3 }
        .let { numbers -> println(numbers) }

    //apply
    val animal = Animal("Cat", 5)
    println(animal)

    animal.apply { this.age = 7 }
    println(animal)

    //with
    val animal2 = with(animal) {
        name = "Dog"
        age = 10
        age
    }

    println(animal2)
}

data class Animal(
    var name: String,
    var age: Int
)