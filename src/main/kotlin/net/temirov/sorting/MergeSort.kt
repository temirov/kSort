package net.temirov.sorting

object MergeSort {
    private tailrec fun merge(
        left: List<Int>,
        right: List<Int>,
        indexLeft: Int = 0,
        indexRight: Int = 0,
        result: List<Int> = emptyList()
    ): List<Int> {
        return when {
            indexLeft < left.size && indexRight < right.size -> {
                val leftElement = left[indexLeft]
                val rightElement = right[indexRight]

                if (leftElement <= rightElement) {
                    val partialResult = result + listOf(leftElement)
                    merge(
                        left = left,
                        right = right,
                        indexLeft = indexLeft.inc(),
                        indexRight = indexRight,
                        result = partialResult
                    )
                } else {
                    val partialResult = result + listOf(rightElement)
                    merge(
                        left = left,
                        right = right,
                        indexLeft = indexLeft,
                        indexRight = indexRight.inc(),
                        result = partialResult
                    )
                }
            }
            indexLeft < left.size -> {
                val leftElement = left[indexLeft]
                val partialResult = result + listOf(leftElement)
                merge(
                    left = left,
                    right = right,
                    indexLeft = indexLeft.inc(),
                    indexRight = indexRight,
                    result = partialResult
                )
            }
            indexRight < right.size -> {
                val rightElement = right[indexRight]
                val partialResult = result + listOf(rightElement)
                merge(
                    left = left,
                    right = right,
                    indexLeft = indexLeft,
                    indexRight = indexRight.inc(),
                    result = partialResult
                )
            }
            else -> result
        }
    }

    fun sort(
        list: List<Int>,
        middle: Int = list.size / 2,
        left: List<Int> = list.subList(0, middle),
        right: List<Int> = list.subList(middle, list.size)
    ): List<Int> = if (list.size <= 1) list else merge(sort(left), sort(right))
}