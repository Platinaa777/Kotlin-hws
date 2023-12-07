class Student(name: String, lastname: String, var grades: MutableList<Int>) : Person(name, lastname) {

    fun expell() {
        println("The student was expelled")
        grades = mutableListOf()
    }

    override fun toString(): String {
        return super.toString() + ", grades: " + grades.map {it -> it}
    }

    fun addGrade(grade: Int) {
        grades.add(grade)
    }
}