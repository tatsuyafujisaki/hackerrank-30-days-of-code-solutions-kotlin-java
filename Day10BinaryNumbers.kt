fun main() {
    println(readLine().orEmpty().toInt().toString(2).split("0+".toRegex()).maxBy(String::count)?.length)
}
