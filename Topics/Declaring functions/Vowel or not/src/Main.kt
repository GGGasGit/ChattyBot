fun isVowel(char: Char): Boolean {
    val vowels = mutableListOf<Char>('a', 'e', 'i', 'o', 'u')
    for (i in 0 until vowels.size) {
        if (char.lowercaseChar() == vowels[i]) return true
    }
    return false
}

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}