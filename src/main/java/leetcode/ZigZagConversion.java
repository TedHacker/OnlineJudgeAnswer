package leetcode;

/**
 * Created by qinjuntao on 2015/8/12.
 * https://leetcode.com/problems/zigzag-conversion/
 */
public class ZigZagConversion {
    public class Solution {
        public String convert(String s, int numRows) {
            if (numRows == 1) return s;
            StringBuilder[] builders = new StringBuilder[numRows];
            for (int i = 0; i < numRows; ++i)
                builders[i] = new StringBuilder();
            for (int i = 0, j, gap = numRows - 2; i < s.length(); ) {
                for (j = 0; i < s.length() && j < numRows; ++i, ++j)
                    builders[j].append(s.charAt(i));
                for (j = gap; i < s.length() && j > 0; ++i, --j)
                    builders[j].append(s.charAt(i));
            }
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < numRows; ++i)
                res.append(builders[i].toString());
            return res.toString();
        }
    }
}
