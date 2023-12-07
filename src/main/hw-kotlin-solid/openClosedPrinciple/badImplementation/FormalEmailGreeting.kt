package openClosedPrinciple.badImplementation

class FormalEmailGreeting : EmailGreeting() {
    override val greeting: String
        get() =  "Good evening, sir."
}