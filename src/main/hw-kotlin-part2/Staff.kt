class Staff(name: String, lastname: String, val phone: String)
    : Person(name, lastname),
    IEmployee {

    fun showNumber() {
        println(phone)
    }

    override var salary: Double = 0.0
        get() = field

    override fun increaseSalary(number: Double) {
        if (salary + number < 0)  {
            // decide to set 0 salary, may be bad employee ))
            salary = 0.0
            return
        }

        salary += number
    }

    override fun toString(): String {
        return super.toString() + " phone $phone"
    }
}