class Solution {
    fun maximumOddBinaryNumber(s: String): String {
        val count = s.count { it == '1'}
        return "1".repeat(count - 1) + "0".repeat(s.length - count) + "1"
    }
}