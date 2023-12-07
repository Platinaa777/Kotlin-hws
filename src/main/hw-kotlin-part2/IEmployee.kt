interface IEmployee {
    var salary: Double

    fun fire() {
        println("salary=$salary")
    }

    fun increaseSalary(number: Double)
}