package leetcode;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/unique-binary-search-trees/
 */
public class UniqueBinarySearchTrees {
    public class Solution {
        public int numTrees(int n) {
            int[] f = new int[n + 1];
            f[0] = 1;
            for (int i = 1; i <= n; ++i) {
                for (int j = 0; j < i; ++j) {
                    f[i] += f[j] * f[i - 1 - j];
                }
            }
            return f[n];
        }
    }
}
