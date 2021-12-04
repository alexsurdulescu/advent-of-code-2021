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

    fun search(input: List<String>, index: Int, comparison: (List<String>, List<String>) -> Boolean): String {
        if (input.size == 1) {
            return input.first()
        }

        val (list0, list1) = input.partition { it[index] == '0' }
        return search(if (comparison(list0, list1)) list0 else list1, index + 1, comparison)
    }

    fun puzzle2(input: List<String>) {
        val generator = search(input, 0) { a, b -> a.size > b.size }
        val scrubber = search(input, 0) { a, b -> a.size <= b.size }

        println(generator.toInt(2) * scrubber.toInt(2))
    }

    val input = readInput("day3_input")

    puzzle1(input)
    puzzle2(input)
}