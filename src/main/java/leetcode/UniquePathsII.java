package leetcode;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/unique-paths-ii/
 */
public class UniquePathsII {
    public class Solution {
        public int uniquePathsWithObstacles(int[][] obstacleGrid) {
            int m = obstacleGrid.length;
            int n = obstacleGrid[0].length;
            int[][] maps = new int[m][n];
            maps[0][0] = (obstacleGrid[0][0] == 1) ? 0 : 1;
            for (int i = 1; i < n; ++i) {
                maps[0][i] = (obstacleGrid[0][i] == 1) ? 0 : maps[0][i - 1];
            }
            for (int i = 1; i < m; ++i) {
                maps[i][0] = (obstacleGrid[i][0] == 1) ? 0 : maps[i - 1][0];
            }
            for (int i = 1; i < m; ++i)
                for (int j = 1; j < n; ++j)
                    if (obstacleGrid[i][j] == 0) maps[i][j] = maps[i - 1][j] + maps[i][j - 1];
                    else maps[i][j] = 0;
            return maps[m - 1][n - 1];
        }
    }
}
