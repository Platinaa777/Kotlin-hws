package domain

import java.io.File
import java.io.FileWriter
import java.io.IOException

class FileWriter(private val path: String) {

    fun saveToFile(str: String) {
        try {
            val file = File(path)
            val fileWriter = FileWriter(file)
            fileWriter.write(str)
            fileWriter.close()
        } catch (e: IOException) {
            println("Ошибка при записи в файл: ${e.message}")
        }
    }
}