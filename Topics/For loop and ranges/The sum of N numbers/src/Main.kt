fun main() {
    val count = readln().toInt()
    val numbers = MutableList(count) { readln().toInt() }

    var sum = 0
    for (i in 0..numbers.lastIndex) {
        sum += numbers[i]
    }

    print(sum)
}