package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/generate-parentheses/
 */
public class GenerateParentheses {
    public class Solution {
        private void dfs(List<String> ls, String s, int a, int b) {
            if (a == 0 && b == 0) {
                ls.add(s);
                return;
            }
            if (a > 0)
                dfs(ls, s + "(", a - 1, b);
            if (a < b && b > 0)
                dfs(ls, s + ")", a, b - 1);
        }

        public List<String> generateParenthesis(int n) {
            List<String> ls = new ArrayList<String>();
            dfs(ls, "", n, n);
            return ls;
        }
    }
}
