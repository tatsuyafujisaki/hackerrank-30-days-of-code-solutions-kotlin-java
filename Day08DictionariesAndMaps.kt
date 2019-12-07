fun main() {
    val phoneBook = mutableMapOf<String, String>()
    repeat(readLine().orEmpty().toInt()) {
        val (name, phoneNumber) = readLine().orEmpty().split(' ')
        phoneBook[name] = phoneNumber
    }
    for (name in generateSequence(::readLine)) {
        println(if (phoneBook.containsKey(name)) "$name=${phoneBook[name]}" else "Not found")
    }
}
