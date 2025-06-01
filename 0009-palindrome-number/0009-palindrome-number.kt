class Solution {
    fun isPalindrome(x: Int): Boolean {
        val xString = x.toString()
        val xReverseString = x.toString().reversed()

        xString.forEachIndexed { index, c ->
            if (c == xReverseString[index]) {
                return@forEachIndexed
            } else {
                return false
            }
        }
        return true
        
    }
}