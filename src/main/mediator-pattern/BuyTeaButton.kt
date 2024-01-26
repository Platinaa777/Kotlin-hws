package vendingMachineTask

class BuyTeaButton(mediator: IMediator<Boolean>, price: Int = 1) : BuyButton(mediator, price) {
    override var typeButton: String = "tea"
}