fun main() {
    val n = readLine().orEmpty().toInt()
    for (i in 1..10) {
        println("$n x $i = ${n * i}")
    }
}
