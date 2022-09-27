fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val n = readln().toInt()

    var count = 0

    for (number in a..b) {
        count += if (number % n == 0) 1 else 0
    }

    print(count)
}