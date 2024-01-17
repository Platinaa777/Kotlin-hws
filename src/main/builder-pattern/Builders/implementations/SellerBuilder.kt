package Builders.implementations

import Builders.IHumanBuilder
import Entities.Human
import Entities.RoleType

class SellerBuilder : IHumanBuilder {
    private var human: Human = Human()

    override fun buildName() {
        human.name = "Seller Petya"
    }

    override fun buildImageURL() {
        human.imageURL = "https://google.com"
    }

    override fun buildStoreName() {
        human.storeName = "petyrochka"
    }

    override fun buildMaxNumberItems() {
        human.maxNumberItems = 100
    }

    override fun buildCreditCardNumber() { }

    override fun buildRole() {
        human.role = RoleType.Seller
    }

    override fun reset() {
        human = Human()
    }

    override fun getHuman(): Human {
        return human
    }
}