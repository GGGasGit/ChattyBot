fun main() {
    val count = readln().toInt()
    val numbers = MutableList(count) { readln().toInt() }

    var result = "YES"
    for (i in 0 until count - 1) {
        if (numbers[i + 1] < numbers[i]) {
            result = "NO"
            break
        }
    }

    print(result)
}