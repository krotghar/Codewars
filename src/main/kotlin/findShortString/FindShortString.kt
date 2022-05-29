package findShortString

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


/**
 * Solution for:
 * https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9/train/kotlin
 *
 * @author Nikita Leonov
 */
fun findShort(s: String) = s.split(" ").minByOrNull { it.length }?.length

class TestExample {
    @Test
    fun testFixed() {
        assertEquals(3, findShort("bitcoin take over the world maybe who knows perhaps"))
        assertEquals(3, findShort("turns out random test cases are easier than writing out basic ones"))
        assertEquals(2, findShort("Let's travel abroad shall we"))
    }
}

