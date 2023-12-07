package dependencyInversionPrinciple.badImplementation

interface IAlertGadget {
    fun generateWeatherAlert(weatherConditions: String): String
}