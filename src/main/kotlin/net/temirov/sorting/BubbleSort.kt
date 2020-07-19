package net.temirov.sorting

object BubbleSort {
    private fun swap(list: List<Int>, index: Int): List<Int> {
        if (index < 0 || index > list.indices.last()) return list

        val firstElement = list[index]
        val secondElement = list[index + 1]

        return list.mapIndexed { ind, element ->
            when (ind) {
                index -> secondElement
                index + 1 -> firstElement
                else -> element
            }
        }
    }

    private tailrec fun swapPass(list: List<Int>, index: Int = 0): List<Int> {
        return if (index == list.indices.last()) list
        else {
            val nextIndex = index + 1
            val semiSortedList = if (list[index] > list[nextIndex]) {
                swap(list, index)
            } else list

            swapPass(semiSortedList, nextIndex)
        }
    }

    tailrec fun sort(list: List<Int>, pass: Int = 0): List<Int> {
        return if (pass == list.size) list else {
            val partiallySorted = swapPass(list)
            val nextPass = pass + 1

            sort(partiallySorted, nextPass)
        }
    }
}