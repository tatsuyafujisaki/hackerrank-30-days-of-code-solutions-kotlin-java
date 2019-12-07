fun readIntegers() = readLine().orEmpty().split(' ').map(String::toInt)

fun main() {
    val matrix = listOf(
        readIntegers(),
        readIntegers(),
        readIntegers(),
        readIntegers(),
        readIntegers(),
        readIntegers()
    )
    var maxHourglassSum = Int.MIN_VALUE
    for (i in 1..4) {
        for (j in 1..4) {
            val hourglassSum = matrix[i - 1][j - 1] + matrix[i - 1][j] + matrix[i - 1][j + 1] + matrix[i][j] + matrix[i + 1][j - 1] + matrix[i + 1][j] + matrix[i + 1][j + 1]
            if (maxHourglassSum < hourglassSum) {
                maxHourglassSum = hourglassSum
            }
        }
    }
    println(maxHourglassSum)
}
