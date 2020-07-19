package net.temirov.sorting.test

import net.temirov.sorting.QuickSort
import net.temirov.sorting.test.net.temirov.sorting.test.SortTestData
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestFactory
import kotlin.random.Random

internal class QuickSortTest {
    @TestFactory
    fun `data sort`() = SortTestData.data
        .map { (input, expected) ->
            DynamicTest.dynamicTest("when I sort $input then I get $expected") {
                Assertions.assertEquals(expected, QuickSort.sort(input))
            }
        }

    @Test
    fun `random sort`() {
        val input = List(10) { Random.nextInt(0, 100) }
        val expectedOutput = input.sorted()

        Assertions.assertEquals(expectedOutput, QuickSort.sort(input))
    }
}