package chapter09


fun main() {
    val person1 = Person("Sene", 20)
    println(person1.name)
    println(person1.age)
    person1.age = 15
    println(person1.age)

    val animal1 = Animal("Cat", 10)
    println(animal1.name)

    val animal2 = Animal("Dog")
    println(animal2.name)
    println(animal2.age)

    println(animal2.isAdult)
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


/**
 * Java Code
 * public class Animal {
 *  private final String name;
 *  private int age;
 *
 *  public Animal(String name, int age) {
 *      if (age < 1) {
 *          throw new IllegalArgumentException("age must be greater than zero");
 *      }
 *      ...
 *
 *      public boolean isAdult() {
 *          return this.age >= 10;
 *      }
 *  }
 *
 * }
 */
class Animal(name: String, var age: Int) {
    // backing field
    val name: String = name
        get() = field.uppercase()

    init {
        if (age < 1) {
            throw IllegalArgumentException("age must be greater than zero")
        }
    }

    constructor(name: String): this(name, 1)

    val isAdult: Boolean
        get() = this.age >= 10
}

