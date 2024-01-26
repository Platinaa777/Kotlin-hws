package vendingMachineTask

class CoinSlot (private val mediator: IMediator<Boolean>) {

    public fun insertCoin(value: Int) {
        println("Customer tries to insert coint...")
        mediator.send(value, "coin-slot")
        println("Coin has been accepted...")
    }
}