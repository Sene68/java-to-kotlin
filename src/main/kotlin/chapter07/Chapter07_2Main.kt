package chapter07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader


fun main() {
    readTextFile()
    readTextFileWithPath(getHelloTextPath("hello.txt"))
}

/**
 * Windows Environment
 */
fun readTextFile() {
    val currentFile = File(".")
    val file = File(currentFile.absolutePath + "\\src\\main\\kotlin\\chapter07\\hello.txt")
    val reader = BufferedReader(FileReader(file))

    println(reader.readLine())
    reader.close()
}


/**
 * Windows Environment
 */
fun readTextFileWithPath(path: String) {
    BufferedReader(FileReader(path)).use { reader ->
        println(reader.readLine())
    }
}

fun getHelloTextPath(fileName: String): String {
    val currentFile = File(".")
    return currentFile.absolutePath + "\\src\\main\\kotlin\\chapter07\\" + fileName
}