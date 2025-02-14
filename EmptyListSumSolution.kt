fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val sum = list.sum()
    println("Sum of list: $sum") // Output: Sum of list: 15

    val emptyList = emptyList<Int>()
    val emptyListSum = emptyList.sum()
    println("Sum of empty list: $emptyListSum") // Output: Sum of empty list: 0

    // Handling potential empty lists with a safe approach
    val anotherList: List<Int> = listOf()
    val safeSum = anotherList.ifEmpty { listOf(0) }.sum()
    println("Safe sum of possibly empty list: $safeSum")
} 