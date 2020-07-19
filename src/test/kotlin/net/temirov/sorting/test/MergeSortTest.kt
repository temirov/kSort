package net.temirov.sorting.test.net.temirov.sorting.test

import net.temirov.sorting.MergeSort
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestFactory
import kotlin.random.Random

internal class MergeSortTest {
    @TestFactory
    fun `data sort`() = SortTestData.data
        .map { (input, expected) ->
            DynamicTest.dynamicTest("when I sort $input then I get $expected") {
                assertEquals(expected, MergeSort.sort(input))
            }
        }

    @Test
    fun `random sort`() {
        val input = List(10) { Random.nextInt(0, 100) }
        val expectedOutput = input.sorted()

        assertEquals(expectedOutput, MergeSort.sort(input))
    }
}