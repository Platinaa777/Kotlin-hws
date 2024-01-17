package Builders.implementations

import Builders.IHumanBuilder
import Entities.Human
import Entities.RoleType

class AdminBuilder() : IHumanBuilder {
    private var human: Human = Human()

    override fun buildName() {
        human.name = "Fedor"
    }

    override fun buildImageURL() { }

    override fun buildStoreName() { }

    override fun buildMaxNumberItems() { }

    override fun buildCreditCardNumber() { }

    override fun buildRole() {
        human.role = RoleType.Admin
    }

    override fun reset() {
        human = Human()
    }

    override fun getHuman(): Human {
        return human
    }
}