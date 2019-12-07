fun main() {
    repeat(readLine().orEmpty().toInt()) {
        val (n, k) = readLine().orEmpty().split(' ').map(String::toInt)
        var max = 0
        for (a in 1..n) {
            for (b in a + 1..n) {
                val ab = a and b
                if (ab in max + 1 until k) {
                    max = ab
                }
            }
        }
        println(max)
    }
}
