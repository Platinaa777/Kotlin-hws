package openClosedPrinciple.badImplementation

class IntimateEmailGreeting : EmailGreeting() {
    override val greeting: String
        get() = "Hello Darling!"
}