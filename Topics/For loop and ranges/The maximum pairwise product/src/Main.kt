fun main() {
    when (val count = readln().toInt()) {
        1 -> print(readln().toInt())
        2 -> {
            val firstNum = readln().toInt()
            val secondNum = readln().toInt()
            print(firstNum * secondNum)
        }
        else -> {
            val numbers = MutableList(count) { readln().toInt() }
            var maxProduct = 0
            for (i in 0 until count - 1) {
                for (j in i + 1 until count) {
                    maxProduct = if (numbers[i] * numbers[j] > maxProduct) numbers[i] * numbers[j] else maxProduct
                }
            }
            print(maxProduct)
        }
    }
}