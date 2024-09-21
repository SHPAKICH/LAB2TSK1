fun main() {
    // Ввод количества строк и столбцов для двумерного массива
    print("Введите количество строк: ")
    val rows = readLine()!!.toInt()

    print("Введите количество столбцов: ")
    val cols = readLine()!!.toInt()

    // Инициализация двумерного массива
    val array = Array(rows) { IntArray(cols) }

    println("Введите ${rows * cols} трёхзначных числа:")

    // Ввод значений в массив
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            array[i][j] = readLine()!!.toInt()
        }
    }

    // Создаем множество для хранения уникальных цифр
    val uniqueDigits = mutableSetOf<Char>()

    // Проход по массиву для извлечения цифр
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            // Превращаем число в строку и добавляем все его цифры в множество
            uniqueDigits.addAll(array[i][j].toString().toList())
        }
    }

    // Вывод двумерного массива
    println("\nДвумерный массив:")
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            print("${array[i][j]} \t")
        }
        println()
    }

    // Вывод количества уникальных цифр
    println("\nВ массиве использовано ${uniqueDigits.size} различных цифр.")
}
