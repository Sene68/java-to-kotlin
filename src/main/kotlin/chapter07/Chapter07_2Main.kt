package chapter07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader


fun main() {
    readTextFile()
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

