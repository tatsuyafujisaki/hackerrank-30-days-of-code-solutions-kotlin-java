fun List<IndexedValue<Char>>.join() = map(IndexedValue<Char>::value).joinToString("")

fun main() {
    repeat(readLine().orEmpty().toInt()) {
        readLine().orEmpty().withIndex().partition { it.index % 2 == 0 }.run {
            println("${first.join()} ${second.join()}")
        }
    }
}
