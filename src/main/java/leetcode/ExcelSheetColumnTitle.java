package leetcode;

import java.util.Stack;

/**
 * Created by qinjuntao on 2015/8/12.
 * https://leetcode.com/problems/excel-sheet-column-title/
 */
public class ExcelSheetColumnTitle {
    public class Solution {
        public String convertToTitle(int n) {
            Stack<Integer> stack = new Stack<Integer>();
            for (; ; ) {
                --n;
                stack.push(n % 26);
                n /= 26;
                if (n <= 0) break;
            }
            StringBuilder builder = new StringBuilder();
            for (; !stack.isEmpty(); stack.pop()) {
                builder.append((char) ('A' + stack.peek()));
            }
            return builder.toString();
        }
    }
}
