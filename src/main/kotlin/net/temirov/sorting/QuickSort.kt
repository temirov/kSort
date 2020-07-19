package net.temirov.sorting

object QuickSort {
    fun sort(list: List<Int>): List<Int> {
        return if (list.size < 2) list else {
            val pivot = list[list.size / 2]
            val equal = list.filter { it == pivot }
            val less = list.filter { it < pivot }
            val greater = list.filter { it > pivot }

            sort(less) + equal + sort(greater)
        }
    }
}