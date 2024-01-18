package openClosedPrinciple.badImplementation

class FormalEmailGreeting : EmailGreeting() {
    override val greeting: String
        get() =  "Entities.Good evening, sir."
}