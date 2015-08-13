package leetcode;

/**
 * Created by qinjuntao on 2015/8/13.
 * https://leetcode.com/problems/longest-common-prefix/
 */
public class LongestCommonPrefix {
    public class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs == null) return null;
            if (strs.length == 0) return "";
            if (strs.length < 2) return strs[0];
            String longest = strs[0];
            StringBuilder builder = new StringBuilder();
            for (int i = 1; i < strs.length; ++i) {
                for (int j = 0; j < longest.length() && j < strs[i].length() && longest.charAt(j) == strs[i].charAt(j); ++j) {
                    builder.append(longest.charAt(j));
                }
                longest = builder.toString();
                builder = new StringBuilder();
            }
            return longest;
        }
    }
}
