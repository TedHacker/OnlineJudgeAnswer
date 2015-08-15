package leetcode;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/reverse-words-in-a-string/
 */
public class ReverseWordsinaString {
    public class Solution {
        public String reverseWords(String s) {
            if (s == null || s.length() < 1) return s;
            StringBuilder builder = new StringBuilder();
            boolean first = true;
            String[] ss = s.split(" ");
            for (int i = ss.length - 1; i >= 0; --i) {
                if (ss[i].length() < 1) continue;
                if (first) {
                    builder.append(ss[i]);
                    first = false;
                } else {
                    builder.append(" ");
                    builder.append(ss[i]);
                }
            }
            return builder.toString();
        }
    }
}
