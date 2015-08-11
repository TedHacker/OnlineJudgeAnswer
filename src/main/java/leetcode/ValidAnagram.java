package leetcode;

/**
 * Created by TedHakcer on 2015/8/10 0010.
 * https://leetcode.com/problems/valid-anagram/
 */
public class ValidAnagram {
    public class Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) return false;
            int[] num = new int[30];
            for (int i = 0; i < 'z' - 'a'; ++i) {
                num[i] = 0;
            }
            for (int i = 0; i < t.length(); ++i) {
                ++num[t.charAt(i) - 'a'];
            }
            for (int i = 0; i < s.length(); ++i) {
                --num[s.charAt(i) - 'a'];
            }
            for (int i = 0; i < 'z' - 'a'; ++i) {
                if (num[i] != 0) return false;
            }
            return true;
        }
    }
}
