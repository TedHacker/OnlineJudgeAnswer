package leetcode;

/**
 * Created by qinjuntao on 2015/8/11.
 * https://leetcode.com/problems/implement-strstr/
 */
public class ImplementstrStr {
    public class Solution {
        public int strStr(String haystack, String needle) {
            if (haystack == null || needle == null || haystack.length() < needle.length() || haystack.length() < 1 || needle.length() < 1)
                return -1;
            char first = needle.charAt(0);
            int i = 0, j = 0;
            for (; i < haystack.length(); ++i) {
                for (; i < haystack.length() && haystack.charAt(i) != first; ++i) ;
                for (j = 0; i + j < haystack.length() && j < needle.length() && haystack.charAt(i + j) == needle.charAt(j); ++j)
                    ;
                if (j == needle.length()) return i;
                if (i + j >= haystack.length()) return -1;
            }
            return -1;
        }
    }
}
