const val AGEMIN = 18
const val AGEMAX = 59

fun main() {
    val number = readln().toInt()

    print(number in AGEMIN..AGEMAX)
}