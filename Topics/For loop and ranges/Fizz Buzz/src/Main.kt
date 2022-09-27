fun main() {
    val beginning = readln().toInt()
    val end = readln().toInt()

    for (number in beginning..end) {
        println(
            if (number % 15 == 0) {
                "FizzBuzz"
            } else if (number % 3 == 0) {
                "Fizz"
            } else if (number % 5 == 0) {
                "Buzz"
            } else {
                number
            }
        )
    }
}