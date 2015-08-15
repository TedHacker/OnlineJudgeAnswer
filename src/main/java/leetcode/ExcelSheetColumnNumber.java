package leetcode;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/excel-sheet-column-number/
 */
public class ExcelSheetColumnNumber {
    public class Solution {
        public int titleToNumber(String s) {
            int len = s.length();
            int ts = 1, temp;
            int sum = 0;
            for (int i = len - 1; i >= 0; --i) {
                temp = s.charAt(i) - 'A' + 1;
                sum += temp * ts;
                ts *= 26;
            }
            return sum;
        }
    }
}
