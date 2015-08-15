package leetcode;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/length-of-last-word/
 */
public class LengthofLastWord {
    public class Solution {
        public int lengthOfLastWord(String s) {
            if (s == null) return 0;
            String[] sl = s.split(" ");
            if (sl.length == 0) return 0;
            return sl[sl.length - 1].length();
        }
    }
}
