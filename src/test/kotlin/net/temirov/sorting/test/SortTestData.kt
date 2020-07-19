package net.temirov.sorting.test.net.temirov.sorting.test

object SortTestData {
    val data = listOf(
        emptyList<Int>() to emptyList<Int>(),
        listOf(1) to listOf(1),
        listOf(1, 2) to listOf(1, 2),
        listOf(3, 2) to listOf(2, 3),
        listOf(7, 2) to listOf(2, 7),
        listOf(3, 2, 7) to listOf(2, 3, 7),
        listOf(5, 4, 3) to listOf(3, 4, 5),
        listOf(72, 4, 3, 91) to listOf(3, 4, 72, 91),
        listOf(72, 4, 3, 91, 23) to listOf(3, 4, 23, 72, 91),
        listOf(10, 74, 92, 41, 4, 24, 49, 63, 8, 35) to listOf(4, 8, 10, 24, 35, 41, 49, 63, 74, 92)
    )
}