fun main() {
    val firstLower = readln().toInt()
    val firstUpper = readln().toInt()
    val secondLower = readln().toInt()
    val secondUpper = readln().toInt()
    val numberToCheck = readln().toInt()
    print(numberToCheck in firstLower..firstUpper || numberToCheck in secondLower..secondUpper)
}