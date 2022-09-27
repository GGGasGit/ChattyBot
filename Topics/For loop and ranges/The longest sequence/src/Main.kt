fun main() {
    val count = readln().toInt()
    val numbers = MutableList(count) { readln().toInt() }

    var longestSequence = 1
    var currentSequence = 1
    for (i in 1 until count) {
        if (numbers[i] >= numbers[i - 1]) {
            currentSequence++
        } else {
            longestSequence = if (currentSequence > longestSequence) currentSequence else longestSequence
            currentSequence = 1
        }
    }

    print(if (currentSequence > longestSequence) currentSequence else longestSequence)
}