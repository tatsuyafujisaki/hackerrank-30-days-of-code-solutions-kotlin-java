fun main() {
    readLine() // Read and discard
    println(readLine().orEmpty().split(' ').map(String::toInt).reversed().joinToString(" "))
}
