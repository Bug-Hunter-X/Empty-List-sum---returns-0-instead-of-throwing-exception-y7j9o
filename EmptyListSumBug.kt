fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val sum = list.sum()
    println(sum) // Output: 15

    val emptyList = emptyList<Int>()
    val emptyListSum = emptyList.sum()
    println(emptyListSum) // Output: 0
}