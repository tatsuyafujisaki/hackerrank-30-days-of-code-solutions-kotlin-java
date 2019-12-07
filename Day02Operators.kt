import kotlin.math.roundToInt

fun main() {
    println((readLine().orEmpty().toDouble() * (100 + readLine().orEmpty().toInt() + readLine().orEmpty().toInt()) / 100).roundToInt())
}
