import Builders.IHumanBuilder
import Entities.Human

class Director(var humanBuilder: IHumanBuilder) {

    fun setBuilder(newHumanBuilder: IHumanBuilder) {
            humanBuilder = newHumanBuilder
    }

    fun build() : Human {
        humanBuilder.reset()
        humanBuilder.buildName()
        humanBuilder.buildRole()
        humanBuilder.buildStoreName()
        humanBuilder.buildImageURL()
        humanBuilder.buildCreditCardNumber()
        humanBuilder.buildMaxNumberItems()

        return humanBuilder.getHuman()
    }
}