package openClosedPrinciple.badImplementation

class CasualEmailGreeting : EmailGreeting() {
    override val greeting: String
        get() = "Sup bro?"
}