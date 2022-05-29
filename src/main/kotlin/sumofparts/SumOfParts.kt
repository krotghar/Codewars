package sumofparts

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

/**
 * Solution for:
 * https://www.codewars.com/kata/5ce399e0047a45001c853c2b/kotlin
 */
fun sumParts(ls: IntArray): IntArray {
    val result = mutableListOf<Int>()
    if (ls.isEmpty())
        return intArrayOf(0)
    var sum = ls.sum()
    result.add(sum)

    for (i in ls) {
        sum -= i
        result.add(sum)
    }

    return result.toIntArray()
}

class SumOfPartsTest {
    private fun doTest(ls: IntArray, expected: IntArray) {
        val actual: IntArray = sumParts(ls)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test() {
        doTest(intArrayOf(), intArrayOf(0));
        doTest(intArrayOf(0, 1, 3, 6, 10), intArrayOf(20, 20, 19, 16, 10, 0))
        doTest(intArrayOf(1, 2, 3, 4, 5, 6), intArrayOf(21, 20, 18, 15, 11, 6, 0))
        doTest(
            intArrayOf(744125, 935, 407, 454, 430, 90, 144, 6710213, 889, 810, 2579358),
            intArrayOf(
                10037855,
                9293730,
                9292795,
                9292388,
                9291934,
                9291504,
                9291414,
                9291270,
                2581057,
                2580168,
                2579358,
                0
            )
        )

    }
}