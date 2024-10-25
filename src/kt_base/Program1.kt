package kt_base


    fun main() {
        println("введите первое число: ")
         val a = readln().toDouble()

        println("введите втoрое число: ")
        val b = readln().toDouble()

        println("введите третье число: ")
        val c = readln().toDouble()
        val average = (a + b + c )/ 3

        println("вывод среднего арифметического: $average" )
    }


