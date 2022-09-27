const val LOWER = 0
const val UPPER = 1000

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val d = readln().toInt()

    for (number in LOWER..UPPER) {
        if (a * number * number * number + b * number * number + c * number + d == 0) println(number)
    }
}