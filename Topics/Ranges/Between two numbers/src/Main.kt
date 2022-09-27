fun main() {
    val numberToCheck = readln().toInt()
    val lower = readln().toInt()
    val upper = readln().toInt()
    print(numberToCheck in lower..upper)
}