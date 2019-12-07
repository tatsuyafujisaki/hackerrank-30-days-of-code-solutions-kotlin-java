fun main() {
    val firstNames = mutableListOf<String>()
    repeat(readLine().orEmpty().toInt()) {
        val (firstName, email) = readLine().orEmpty().split(' ')
        if (email.endsWith("@gmail.com")) {
            firstNames.add(firstName)
        }
    }
    firstNames.sorted().forEach(::println)
}
