fun main() {
    val a = readln().toInt()
    val b = readln().toInt()

    var product: Long = 1
    for (number in a until b) {
        product *= number
    }

    print(product)
}