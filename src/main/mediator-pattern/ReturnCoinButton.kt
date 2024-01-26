package vendingMachineTask


class ReturnCoinButton(private val mediator: IMediator<Boolean>) {

    public fun returnCoins() {
        if (mediator.send(1, "return-coin-button"))
            println("Returning all coins...")
        else
            println("Machine has no coins to return...")
    }

}