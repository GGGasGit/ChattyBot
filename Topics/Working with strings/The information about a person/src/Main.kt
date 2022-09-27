fun main() {
    val (firstName, lastName, age) = readln().split(" ")

    print("${firstName.first()}. $lastName, $age years old")
}