package vendingMachineTask

abstract class BuyButton(val mediator: IMediator<Boolean>, var price : Int) {
    open fun buy() {
        if (mediator.send(price, "buy-coffee-button"))
            println("Preparing ${typeButton}...")
        else
            println("Not enough to buy ${typeButton}...")
    }

    open var typeButton = ""
}