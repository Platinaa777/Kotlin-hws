package dependencyInversionPrinciple.badImplementation

class Phone : IAlertGadget {
    override fun generateWeatherAlert(weatherConditions: String): String {
        return "Phone: It is $weatherConditions"
    }
}