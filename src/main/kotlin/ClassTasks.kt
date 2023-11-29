/**
 * Задание 1: Объявите классы Circle и Square – наследников базового (Point).
 * Реализуйте readonly свойство, вычисляющее площадь каждой фигуры, а также функцию display()
 * для вывода информации о фигуре на экран.
 *
 * (3 балла)
 */

open class Point(val X: Double, val Y: Double) {

    open var area: Double = 0.0
        get() = field


    open fun display() {
        // Формат вывода – S = ... , X = ... , Y = ...
        println("S = ${area}, X = ${X}, Y = ${Y}")
    }
}

class Circle(X:Double, Y: Double, val R: Double) : Point(X = X, Y = Y) {

    override var area: Double = Math.PI * R * R
        get() = Math.PI * R * R
    override fun display() {
        println("S = ${area}, X = ${X}, Y = ${Y}, Raduis = ${R}")
    }
}

class Square(X: Double, Y: Double, val Side: Double) : Point(X,Y) {
    override var area: Double = Side * Side
        get() = field

    override fun display() {
        println("S = ${area}, X = ${X}, Y = ${Y}, Side = ${Side}")
    }
}


fun main() {
    val p = Point(34.0, 56.0)
    val c = Circle(46.0, 34.0, 7.0)
    val s = Square(46.0, 34.0, 8.0)
    p.display()
    c.display()
    s.display()
}