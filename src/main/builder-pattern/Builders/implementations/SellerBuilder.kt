package Builders.implementations

import Builders.IHumanBuilder
import Entities.Human
import Entities.RoleType
import Entities.Seller

class SellerBuilder : IHumanBuilder {
    private var human: Human = Seller()

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
        human = Seller()
    }

    override fun getHuman(): Human {
        return human
    }
}