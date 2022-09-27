const val TEN = 10

fun getLastDigit(num: Int): Int = if (num > 0) num % TEN else -num % TEN

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}