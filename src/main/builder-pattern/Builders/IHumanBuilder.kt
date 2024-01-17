package Builders

import Entities.Human

interface IHumanBuilder {
    fun buildName()
    fun buildImageURL()
    fun buildStoreName()
    fun buildMaxNumberItems()
    fun buildCreditCardNumber()
    fun buildRole()
    fun reset()
    fun getHuman() : Human
}