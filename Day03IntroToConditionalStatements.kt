fun main() {
    val weird = "Weird"
    val notWeird = "Not Weird"
    val n = readLine().orEmpty().toInt()
    println(when {
        n % 2 == 1 -> weird
        n in 2..5 -> notWeird
        n in 6..20 -> weird
        else -> notWeird
    })
}
