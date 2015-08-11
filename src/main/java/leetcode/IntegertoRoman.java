package leetcode;

/**
 * Created by TedHakcer on 2015/8/10 0010.
 * https://leetcode.com/problems/integer-to-roman/
 */
public class IntegertoRoman {
    public class Solution {
        public String intToRoman(int num) {
            StringBuilder builder = new StringBuilder();
            String[] str = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
            int[] val = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            for (int i = 0; num > 0; ++i) {
                for (; num >= val[i]; ) {
                    num -= val[i];
                    builder.append(str[i]);
                }
            }
            return builder.toString();
        }
    }
}
