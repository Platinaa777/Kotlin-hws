import java.util.Dictionary

/**
 *  Задание 1: Заменить все повторяющиеся элементы входного списка на "blahblah".
 *  (1 балл)
 */
fun replaceElements(array: List<String>): List<String> {
    val map = mutableMapOf<String, Int>()

    for (element in array) {
        if (map.containsKey(element)) {
            map[element] = map[element]!! + 1
        } else {
            map[element] = 1
        }
    }

     return array.map { if (map[it]!! > 1) "blahblah" else it }
}


/**
 *  Задание 2: Вернуть количество уникальных слов в строке.
 *  Слова в строке обязательно разделяются пробелом.
 *  (1 балл)
 */
fun uniqueWords(text: String): Int {
    var arr = text.split(' ')
    val map = mutableMapOf<String, Int>()

    for (element in arr) {
        if (map.containsKey(element)) {
            map[element] = map[element]!! + 1
        } else {
            map[element] = 1
        }
    }

    var count = 0
    for (i in map) {
        if (map[i.key] == 1) {
            count++
        }
    }
    return count
}

// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
    val text = ""
    //println(uniqueWords(text))

    // Вызвать для text и вывести результат замены на экран
    //replaceElements()
}