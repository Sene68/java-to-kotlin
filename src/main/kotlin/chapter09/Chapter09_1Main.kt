package chapter09


fun main() {
    val person1 = Person("Sene", 20)
    println(person1.name)
    println(person1.age)
    person1.age = 15
    println(person1.age)
}

/**
 * Java Code
 * public class Person {
 *  private final String name;
 *  private int age;
 *
 *  ... constructor
 *
 *  ... getter & setter
 * }
 *
 */
class Person(val name: String, var age: Int)

