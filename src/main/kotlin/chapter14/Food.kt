package chapter14

fun handleFood(food: Food) {
    when (food) {
        Food.CAT -> println("Cat Food")
        Food.DOG -> println("Dog Food")
    }
}

enum class Food(
    private val code: String
) {
    CAT("CT"),
    DOG("DG")
    ;
}