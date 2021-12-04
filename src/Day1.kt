import data.readInput

fun main() {
    fun puzzle1(input: List<Int>) {
        val result = input.windowed(2).count { (a, b) -> a < b }
        println(result)
    }

    fun puzzle2(input: List<Int>) {
        val result = input.windowed(4).count { it[0] < it[3] }
        println(result)
    }

    val input = readInput("day1_input").map(String::toInt)

    puzzle1(input)
    puzzle2(input)
}
