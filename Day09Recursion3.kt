tailrec fun factorial(n: Int, acc: Int = 1): Int = if (n <= 1) acc else factorial(n - 1, acc * n)

fun main() {
    println(factorial(readLine().orEmpty().toInt()))
}
