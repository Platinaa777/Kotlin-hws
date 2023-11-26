/**
 * Задание 1: Объявите классы Circle и Square – наследников базового (Point).
 * Реализуйте readonly свойство, вычисляющее площадь каждой фигуры, а также функцию display()
 * для вывода информации о фигуре на экран.
 *
 * (3 балла)
 */

open class Point(val X: Double, val Y: Double) {

    private val area: Double = 0.0

    fun display() {
        // Формат вывода – S = ... , X = ... , Y = ...
        println("S = ${area}, X = ${X}, Y = ${Y}")
    }
}


// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
//    val p = Point(34, 56)
//    val c = Circle(46, 34, 7)
//    val s = Square(46, 34, 8)
//    p.display()
//    c.display()
//    s.display()
}