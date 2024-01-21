import domain.Notifier


fun main() {

    val adapter = Adapter()
    val notifier = Notifier("hello world", adapter)

    notifier.notifyWriter()
}