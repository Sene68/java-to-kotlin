package chapter03

fun main() {
    printAgeIfAnimal(Animal("",15))
    printIfNotAnimal(Person("sene"))
    printIfAnimalIsNull(null)
    printIfAnimalIsNull(Animal("",15))
}

/**
 * Java Code
 * public static void printAgeIfAnimal(Object obj) {
 *  if (obj instanceof Animal) {
 *    Animal animal = (Animal) obj;
 *    System.out.println(animal.getAge());
 *  }
 * }
 */
fun printAgeIfAnimal(obj: Any) {
    if (obj is Animal) {
        println(obj.age)
    }
}

/**
 * Java Code
 * public static void printIfNotAnimal(Object obj) {
 *  if (!(obj instanceof Animal)) {
 *    Animal animal = (Animal) obj;
 *    System.out.println(animal.getAge());
 *  }
 * }
 */
fun printIfNotAnimal(obj: Any) {
    if (obj !is Animal) {
        println("Not animal")
    }
}

/**
 * Object is null case
 */
fun printIfAnimalIsNull(obj: Any?) {
    val animal = obj as? Animal
    println(animal?.age)
}

class Animal(val name: String, val age: Long)
class Person(val name: String)