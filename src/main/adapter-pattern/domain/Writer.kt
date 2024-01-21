package domain

import domain.interfaces.IWriter


class Writer : IWriter {

    override fun write(message: String) {
        println("Writer: " + message)
    }
}