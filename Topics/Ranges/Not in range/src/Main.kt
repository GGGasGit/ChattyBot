const val RANGEMIN = 1
const val RANGEMAX = 10

fun main() {
    val number = readln().toInt()

    print(number !in RANGEMIN..RANGEMAX)
}