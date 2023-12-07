package interfaceSegregationPrinciple.badImplementation


class Eagle(var numberOfFeathers: Int) : Bird, ICanFly {
    var currentLocation: String? = null

    override fun fly() {
        currentLocation = "in the air"
    }

    override fun looseFeathers() {
        numberOfFeathers -= 1
    }
}