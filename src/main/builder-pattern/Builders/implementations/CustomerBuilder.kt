package Builders.implementations

import Builders.IHumanBuilder
import Entities.Human
import Entities.RoleType

class CustomerBuilder : IHumanBuilder {
    private var human: Human = Human()

    override fun buildName() {
        human.name = "Customer Vova"
    }

    override fun buildImageURL() { }

    override fun buildStoreName() { }

    override fun buildMaxNumberItems() { }

    override fun buildCreditCardNumber() {
        human.creditCardNumber = 1232283020323
    }

    override fun buildRole() {
        human.role = RoleType.Customer
    }

    override fun reset() {
        human = Human()
    }

    override fun getHuman(): Human {
        return human
    }
}