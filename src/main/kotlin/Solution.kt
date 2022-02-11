class Solution {
    fun isPowerOfFour(n: Int): Boolean {
        val base4 = n.toString(4)
        val reg = Regex("^10*$")
        return base4.matches(reg)
    }
}