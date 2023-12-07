class Proffesor(name: String, lastname : String, var boss: Staff)
    : Person(name, lastname),
    IEmployee {

    fun assignBoss(newBoss: Staff) {
        boss = newBoss
    }

    override var salary: Double = 0.0
        get() = field

    override fun increaseSalary(number: Double)  {
        if (salary + number < 0)  {
            // decide to set 0 salary, may be bad employee ))
            salary = 0.0
            return
        }

        salary += number
    }

    override fun toString(): String {
        return super.toString() + " boss: " + boss.toString()
    }
}