import kotlin.math.sqrt

/**
Задание 1: Функция,спрашивающая у пользователя его ФИО и выводящая его на экране.
(0.5 балла)
Формат вывода:
" Фамилия:
Имя:
Отчество:
"
 */
fun askForInput() {
    print("Фамилия: ")
    var lastName = readLine()
    print("Имя: ")
    var firstName = readLine()
    print("Отчество: ")
    var surName = readLine()
}

/**
Задание 2: Функция, вычисляющая и возвращающая корни квадратного уравнения. (1 балл)
 */
fun quadraticRoots(a: Double, b: Double, c: Double): Pair<Double, Double> {
    if (a == 0.0 && b == 0.0) {
        // maybe throw exception or something like that
        return 0.0 to 0.0
    }

    if (a == 0.0) {
        // 1 root but in fun we have strict return type, i just return 0.0 in second root
        return c/b to 0.0
    }

    // -b + sqrt(dis) / 2a
    var discriminant = b*b - 4*a*c
    if (discriminant < 0) {
        // again too strict return value
        return 0.0 to 0.0
    }
    discriminant = sqrt(discriminant)
    var x1 = (-b + discriminant) / (2.0 * a)
    var x2 = (-b - discriminant) / (2.0 * a)

    return x1 to x2
}

/**
Задание 3: Вывести на экран трёхзначные десятичные числа s, все цифры которых одинаковы.
(2 балла)
 */
fun printSameDigitNumbers() {
    // read s
    print("enter number s: ")
    var s = readLine()
    if (s == null || s.length < 3) return

    var first = s[0]
    var second = s[1]
    var third = s[2]

    for (i in 2..s.length-1) {
        if (s[i - 2] == s[i - 1] && s[i - 1] == s[i]) {
            println("${s[i - 2]}${s[i - 1]}${s[i]}")
        }
    }
}

// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
    askForInput()

    val roots = quadraticRoots(-5.0, 4.0, 3.0)
    println("X1 = ${roots.first} ; X2 =${roots.second}")

    printSameDigitNumbers()
}
