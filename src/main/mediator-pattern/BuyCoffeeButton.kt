package vendingMachineTask

class BuyCoffeeButton(mediator: IMediator<Boolean>, price: Int = 2) : BuyButton(mediator, price) {
    override var typeButton: String = "coffee"
}