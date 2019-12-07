import java.time.LocalDate

fun readLocalDate(): LocalDate {
    val (day, month, year) = readLine().orEmpty().split(' ').map(String::toInt)
    return LocalDate.of(year, month, day)
}

fun fine(actual: LocalDate, expected: LocalDate) = when {
    actual <= expected -> 0
    actual.year == expected.year && expected.month == actual.month && expected.dayOfMonth < actual.dayOfMonth -> 15 * (actual.dayOfMonth - expected.dayOfMonth)
    actual.year == expected.year && expected.month < actual.month -> 500 * (actual.monthValue - expected.monthValue)
    else -> 10000
}

fun main() {
    println(fine(readLocalDate(), readLocalDate()))
}
