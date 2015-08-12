package leetcode;

/**
 * Created by TedHakcer on 2015/8/12 0012.
 * https://leetcode.com/problems/palindrome-number/
 */
public class PalindromeNumber {
    public class Solution {
        public boolean isPalindrome(int x) {
            if (x < 0) return false;
            long a = x;
            long b = 0;
            for (; x > 0; x /= 10) {
                b = b * 10 + x % 10;
            }
            return a == b;
        }
    }
}
