package chapter01

fun main() {

    /**
     * Java Code
     * long number1 = 10L;
     */
    var number1: Long = 10L

    /**
     * Java Code
     * final long number2 = 10L;
     */
    val number2: Long = 1_000L

    /**
     * nullable variable
     */
    val number3: Long? = null

    /**
     * Java Code
     * Animal animal = new Animal("cat");
     */
    val animal = Animal("cat")

    println("number1 : $number1")
    println("number2 : $number2")
    println("number3 : $number3")
    println("animal name : " + animal.name)

}

class Animal(val name: String)
