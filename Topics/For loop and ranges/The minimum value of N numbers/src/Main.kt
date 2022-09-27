fun main() {
    val count = readln().toInt()
    val numbers = MutableList(count) { readln().toInt() }

    var minimum = numbers[0]
    for (i in 1 until count) {
        minimum = if (numbers[i] < minimum) numbers[i] else minimum
    }

    print(minimum)
}