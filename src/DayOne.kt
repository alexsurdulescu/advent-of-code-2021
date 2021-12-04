import data.readInput

fun puzzle1(input: List<Int>) {
    val result = input.windowed(2).count { (a, b) -> a < b }
    print(result)
}

fun puzzle2(input: List<Int>) {

}

fun main() {
    val input = readInput("day1_input").map(String::toInt)

    puzzle1(input)
    puzzle2(input)
}
