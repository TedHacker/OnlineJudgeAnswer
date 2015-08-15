package leetcode;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/unique-paths/
 */
public class UniquePaths {
    public class Solution {
        public int uniquePaths(int m, int n) {
            int[][] maps = new int[m][n];
            for (int i = 0; i < n; ++i)
                maps[0][i] = 1;
            for (int i = 0; i < m; ++i)
                maps[i][0] = 1;
            for (int i = 1; i < m; ++i)
                for (int j = 1; j < n; ++j)
                    maps[i][j] = maps[i - 1][j] + maps[i][j - 1];
            return maps[m - 1][n - 1];
        }
    }
}
