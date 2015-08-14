package leetcode;

/**
 * Created by qinjuntao on 2015/8/14.
 * https://leetcode.com/problems/n-queens-ii/
 */
public class NQueensII {
    public class Solution {
        int[] idxs;
        int counts;

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
                ++counts;
                return;
            }
            for (int i = 0; i < n; ++i) {
                idxs[deep] = i;
                if (valid(deep)) {
                    calculate(deep + 1, n);
                }
            }
        }

        public int totalNQueens(int n) {
            idxs = new int[n];
            counts = 0;
            calculate(0, n);
            return counts;
        }
    }
}
