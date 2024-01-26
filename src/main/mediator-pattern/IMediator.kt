package vendingMachineTask

interface IMediator<TResponse> {
    fun send(message: Int, sender: String) : TResponse
}