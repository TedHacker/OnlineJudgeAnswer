package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/n-queens/
 */
public class NQueens {
    public class Solution {
        int[] idxs;
        List<List<String>> res;

        private boolean valid(int deep) {
            for (int i = 0; i < deep; ++i) {
                if (idxs[i] == idxs[deep] || deep - i == Math.abs(idxs[i] - idxs[deep])) {
                    return false;
                }
            }
            return true;
        }

        private void calculate(int deep, int n) {
            if (deep == n) {
                List<String> ans = new ArrayList<String>();
                for (int i = 0; i < n; ++i) {
                    StringBuilder sb = new StringBuilder();
                    for (int j = 0; j < n; ++j) {
                        if (j == idxs[i]) {
                            sb.append("Q");
                        } else {
                            sb.append(".");
                        }
                    }
                    ans.add(sb.toString());
                }
                res.add(ans);
                return;
            }
            for (int i = 0; i < n; ++i) {
                idxs[deep] = i;
                if (valid(deep)) {
                    calculate(deep + 1, n);
                }
            }
        }

        public List<List<String>> solveNQueens(int n) {
            idxs = new int[n];
            res = new ArrayList<List<String>>();
            calculate(0, n);
            return res;
        }
    }
}
