package vendingMachineTask

fun main() {
    // TODO: A collection of classes represents a vending machine.
    // Vending machine sells tea for 1 coin and coffee for 2 coins
    // Customer can:
    // - insert coins in CoinSlot
    // - select beverage with specific button
    // - refund his coins (if there are any)

    // TODO: There are several problems
    // - CoinSlot, coffeeButton, teaButton all have direct references to CoinsState
    // - BuyCoffeeButton, BuyTeaButton have similar copy-pasted logic. Would be better to unify them
    //
    // Restrictions:
    // - Classes BuyCoffeeButton, BuyTeaButton, ReturnCoinButton and CoinSlot
    //   must not be deleted or renamed

    // TODO: Apply Mediator pattern or discuss why the other might be better


    val state = CoinsState()
    val mediator = Mediator(state)

    var coinSlot = CoinSlot(mediator)
    var buyCoffeeButton = BuyCoffeeButton(mediator)
    var buyTeaButton = BuyTeaButton(mediator)
    var returnCoinButton = ReturnCoinButton(mediator)


    var input = readLine()
    while (input != "break") {
        var args = input!!.split(' ')
        when (args[0]) {
            // input: insert [number]
            "insert" -> {
                if (args.size == 2) {
                    coinSlot.insertCoin(args[1].toInt())
                }
            }
            // input: buy [tea or coffee]
            "buy" -> {
                var args = input.split(' ')
                if (args.size == 2 && args[1] == "coffee") { buyCoffeeButton.buy() }
                else if (args.size == 2 && args[1] == "tea") {buyTeaButton.buy()}
            }
            "return" -> {
                returnCoinButton.returnCoins()
            }
            else -> {}
        }
        input = readLine()
    }

}