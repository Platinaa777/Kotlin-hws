package interfaceSegregationPrinciple.badImplementation


class Penguin(var numberOfFeathers: Int) : Bird, ICanSwim {
    var currentLocation: String? = null

    override fun looseFeathers() {
        numberOfFeathers -= 1
    }

    override fun swim() {
        currentLocation = "in the water"
    }
}