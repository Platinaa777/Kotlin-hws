package domain

import domain.interfaces.IWriter

class Notifier(var message: String, private val writer: IWriter) {

    fun notifyWriter() {
        writer.write(message)
    }

    fun changeMessage(value : String) {
        message = value
    }
}