import domain.FileWriter
import domain.interfaces.IWriter

class Adapter : IWriter {

    private val writer = FileWriter("./123.txt")

    override fun write(message: String) {
        writer.saveToFile(message)
    }
}