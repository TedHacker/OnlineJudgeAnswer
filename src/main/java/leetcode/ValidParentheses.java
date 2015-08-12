package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by qinjuntao on 2015/8/12.
 * https://leetcode.com/problems/valid-parentheses/
 */
public class ValidParentheses {
    public class Solution {
        Map<Character, Integer> hashx = new HashMap<Character, Integer>() {
            {
                put('(', 1);
                put(')', -1);
                put('[', 2);
                put(']', -2);
                put('{', 3);
                put('}', -3);
            }
        };

        public boolean isValid(String s) {
            Stack<Integer> stack = new Stack<Integer>();
            int tmp;
            for (int i = 0; i < s.length(); ++i) {
                tmp = hashx.get(s.charAt(i));
                if (tmp > 0) {
                    stack.push(tmp);
                } else {
                    if (stack.isEmpty()) return false;
                    if (stack.peek() + tmp != 0) return false;
                    stack.pop();
                }
            }
            return true;
        }
    }
}
