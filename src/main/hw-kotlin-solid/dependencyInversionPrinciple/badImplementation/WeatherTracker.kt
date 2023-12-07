package dependencyInversionPrinciple.badImplementation

class WeatherTracker (private var conditions: String,
                      private val notificationGadget: IAlertGadget )
{
    private var notification = ""

    fun setCurrentConditions(weatherDescription: String) {
        this.conditions = weatherDescription
        notification = notificationGadget.generateWeatherAlert(weatherDescription)
    }

    fun printNotificationMessage() {
        println(notification)
    }
}