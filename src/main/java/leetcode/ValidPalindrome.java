package leetcode;

/**
 * Created by qinjuntao on 2015/8/12
 * https://leetcode.com/problems/valid-palindrome/.
 */
public class ValidPalindrome {
    public class Solution {
        public boolean isPalindrome(String s) {
            if (s == null || s.length() < 1) return true;
            s = s.toLowerCase();
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < s.length(); ++i) {
                if (('a' <= s.charAt(i) && s.charAt(i) <= 'z') || ('0' <= s.charAt(i) && s.charAt(i) <= '9')) {
                    builder.append(s.charAt(i));
                }
            }
            s = builder.toString();
            for (int i = 0, j = s.length() - 1; i < j; ++i, --j) {
                if (s.charAt(i) != s.charAt(j))
                    return false;
            }
            return true;
        }
    }
}
