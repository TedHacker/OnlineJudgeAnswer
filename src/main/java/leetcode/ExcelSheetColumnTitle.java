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
            for (; n > 0; n /= 26) {
                stack.push(n % 26);
            }
            StringBuilder builder = new StringBuilder();
            for (; !stack.isEmpty(); stack.pop()) {
                builder.append('A' + stack.peek());
            }
            return builder.toString();
        }
    }
}
