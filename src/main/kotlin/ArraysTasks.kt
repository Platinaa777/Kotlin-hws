/**
Задание 1: Сформировать целочисленный массив A из N элементов
при помощи ввода значений с клавиатуры (N вводит пользователь).
Вывести массив на экран. (1 балл)
 */
fun makeArray(): Array<Int> {
    var list: Array<Int> = arrayOf()
    print("Enter count of number in array: ")
    var n: Int = readLine()!!.toInt()

    for (i in 1..n step 1) {
        var element = readLine()!!.toInt()
        list += element
    }

    println(list.joinToString())

    return list
}

/**
Задание 2: Написать функцию для сортировки массива по убыванию и его вывода на экран.
Использовать встроенные функции. (0.5 балла)
 */
fun sortArrayDesc(arr: Array<Int>) {
    arr.sortDescending()
    println(arr.joinToString(" "))
}

fun main() {
    val arr = makeArray()

    sortArrayDesc(arr)
}