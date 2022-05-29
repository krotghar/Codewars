package catmouse

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 * Solutions for:
 * https://www.codewars.com/kata/57ee24e17b45eff6d6000164/train/kotlin
 *
 * @author Nikita Leonov
 */
fun catMouse(s: String) =
    if (s.filter { it == '.' }.length > 3) "Escaped!"
    else "Caught!"

class CatMouseTests {

    @Test
    fun basicTests() {
        assertEquals("Escaped!", catMouse("C....m"))
        assertEquals("Caught!", catMouse("C..m"))
        assertEquals("Escaped!", catMouse("C.....m"))
        assertEquals("Caught!", catMouse("C.m"))
    }
}