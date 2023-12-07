import dependencyInversionPrinciple.badImplementation.Emailer
import dependencyInversionPrinciple.badImplementation.Phone
import dependencyInversionPrinciple.badImplementation.WeatherTracker
import interfaceSegregationPrinciple.badImplementation.Eagle
import interfaceSegregationPrinciple.badImplementation.Penguin
import openClosedPrinciple.badImplementation.EmailGreeting
import openClosedPrinciple.badImplementation.FormalEmailGreeting


fun main(args: Array<String>) {
    // ЗАДАНИЕ 1: Приветствие

    // теперь можно класс email message расширять подставляю
    // производный класс
    val greeting: EmailGreeting = FormalEmailGreeting()

    require(greeting.greeting == "Good evening, sir.") {
        "Wrong message intro"
    }

    // ЗАДАНИЕ 2: Уведомления о погоде
    var phone = Phone();
    val tracker = WeatherTracker(conditions = "sunny", phone)

    // let's get a phone notification
    tracker.setCurrentConditions("rainy")

    tracker.printNotificationMessage()

    var emailer = Emailer()

    val tracker2 = WeatherTracker(conditions = "rainy", emailer)

    tracker2.setCurrentConditions("rainy")

    tracker2.printNotificationMessage()

    // ЗАДАНИЕ 3: Птицы бывают разные (но не все всё умеют)
    val eagle = Eagle(150)
    eagle.fly()

    val penguin = Penguin(0)

    // Пингвин не хочет чувствовать себя ущербным:(
    // А мы не хотим видеть исключения в коде...

    // Разделил на разные интерфейсы тем самым, обеспечил, что пингвин не сможет летать,
    // но может плавать
    //penguin.fly()



}