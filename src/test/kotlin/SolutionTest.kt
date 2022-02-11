import kotlin.test.Test
import kotlin.test.assertEquals

internal class SolutionTest {
    private val sol: Solution = Solution()
    @Test
    fun isPowerOfFourExample1() {
        assertEquals(true, sol.isPowerOfFour(4))
    }
    @Test
    fun isPowerOfFourExample2() {
        assertEquals(false, sol.isPowerOfFour(0))
    }
    @Test
    fun isPowerOfFourExample3() {
        assertEquals(true, sol.isPowerOfFour(256))
    }
    @Test
    fun isPowerOfFourExample4() {
        assertEquals(false, sol.isPowerOfFour(192))
    }
    @Test
    fun isPowerOfFourExample5() {
        assertEquals(false, sol.isPowerOfFour(128))
    }
}