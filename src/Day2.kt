import data.readInput

fun main() {
    data class Command(val direction: String, val value: Int)

    fun puzzle1(input: List<Command>) {
        var depth = 0
        var horizontal = 0

        for (command in input) {
            when (command.direction) {
                "up" -> depth -= command.value
                "down" -> depth += command.value
                "forward" -> horizontal += command.value
            }
        }

        println(depth * horizontal)
    }

    fun puzzle2(input: List<Command>) {
        var aim = 0
        var depth = 0
        var horizontal = 0

        for (command in input) {
            when (command.direction) {
                "up" -> aim -= command.value
                "down" -> aim += command.value
                "forward" ->  {
                    horizontal += command.value
                    depth += command.value * aim
                }
            }
        }

        println(depth * horizontal)
    }

    val input = readInput("day2_input")
        .map { it.split(' ') }
        .map { Command(it[0], it[1].toInt()) }

    puzzle1(input)
    puzzle2(input)
}
