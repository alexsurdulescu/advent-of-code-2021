import data.readInput

fun main() {
    fun puzzle1(input: List<String>) {
        val size = input.size

        var gamma = ""
        var epsilon = ""
        repeat(input.first().length) { index ->
            val sum = input.sumOf { it[index].digitToInt() }
            if (sum > size / 2) {
                gamma += '0'
                epsilon += '1'
            } else {
                gamma += '1'
                epsilon += '0'
            }
        }

        println(gamma.toInt(2) * epsilon.toInt(2))
    }

    fun puzzle2(input: List<String>) {

    }

    val input = readInput("day3_input")

    puzzle1(input)
    puzzle2(input)
}