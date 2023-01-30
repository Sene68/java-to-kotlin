package chapter10

abstract class Snack(
    protected val name: String,
    protected val price: Int,
) {
    abstract fun make()
}