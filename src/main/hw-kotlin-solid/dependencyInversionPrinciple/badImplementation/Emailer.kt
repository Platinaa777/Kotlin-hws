package dependencyInversionPrinciple.badImplementation

class Emailer : IAlertGadget {
    override fun generateWeatherAlert(weatherConditions: String): String {
        return "Email: It is $weatherConditions"
    }
}