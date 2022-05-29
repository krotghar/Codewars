package sumOfOdd

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 * Solutions for:
 * https://www.codewars.com/kata/55fd2d567d94ac3bc9000064/kotlin
 *
 * @author Nikita Leonov
 */

fun rowSumOddNumbers(n: Int): Int {
    val startIndex = findIndex(n - 1)
    var result = 0
    for (i in startIndex..startIndex + n * 2) {
        if (i % 2 != 0)
            result += i
    }
    return result
}

private fun findIndex(n: Int) = n * (n + 1)


class TestKata {
    @Test
    fun basicTests() {
        assertEquals(1, rowSumOddNumbers(1))
        assertEquals(8, rowSumOddNumbers(2))
        assertEquals(2197, rowSumOddNumbers(13))
        assertEquals(6859, rowSumOddNumbers(19))
        assertEquals(68921, rowSumOddNumbers(41))
        assertEquals(74088, rowSumOddNumbers(42))
        assertEquals(405224, rowSumOddNumbers(74))
        assertEquals(636056, rowSumOddNumbers(86))
        assertEquals(804357, rowSumOddNumbers(93))
        assertEquals(1030301, rowSumOddNumbers(101))
    }
}