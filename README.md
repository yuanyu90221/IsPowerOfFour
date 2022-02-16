# IsPowerOfFour

Write a method to judge whether an input number is power of four

## 我的解法

如同 isPowerOfTwo 一樣

可以知道 如果轉成 base4

假設是 4 的次方數 會符合 10*$ 這樣的模式

```kotlin
class Solution {
    fun isPowerOfThree(n: Int): Boolean {
        val base4 = n.toString(4)
        val reg = Regex("^10*$")
        return base4.matches(reg)
    }
}
```