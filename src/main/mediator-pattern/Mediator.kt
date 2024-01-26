package vendingMachineTask

class Mediator(val coinsState: CoinsState) : IMediator<Boolean> {

    val coffeeButton: BuyCoffeeButton = BuyCoffeeButton(this)
        get() = field

    val teaButton: BuyTeaButton = BuyTeaButton(this)
        get() = field

    var coinSlot: CoinSlot = CoinSlot(this)
        get() = field

    var returnCoin: ReturnCoinButton = ReturnCoinButton(this)
        get() = field

    override fun send(message: Int, sender: String) : Boolean {
        if (sender == "buy-coffee-button" || sender == "buy-tea-button"  || sender == "return-coin-button") {
            println("minus ${message}")
            return coinsState.hasEnoughCoins(message)
        } else if (sender == "coin-slot") {
            println("plus ${message}")
            coinsState.insertCoin(message)
        }
        return false
    }
}
