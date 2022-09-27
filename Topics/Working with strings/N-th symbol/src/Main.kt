fun main() {
    val text = readln()
    val number = readln().toInt()

    print("Symbol # $number of the string \"$text\" is '${text[number - 1]}'")
}