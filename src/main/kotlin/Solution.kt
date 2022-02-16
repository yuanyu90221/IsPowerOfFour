import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.log

class Solution {
    fun isPowerOfFour(n: Int): Boolean {
//        val base4 = n.toString(4)
//        val reg = Regex("^10*$")
//        return base4.matches(reg)
        if (n == 0) return false
        val result = log(n.toDouble(), 4.toDouble())
        return floor(result) == ceil(result)
    }
}