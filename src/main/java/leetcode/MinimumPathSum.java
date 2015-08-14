package leetcode;

/**
 * Created by qinjuntao on 2015/8/14.
 * https://leetcode.com/problems/minimum-path-sum/
 */
public class MinimumPathSum {
    public class Solution {
        int n, m;
        int minx;
        int[][] mapx;

        private void dfs(int x, int y, int sumx) {
            if (x == n - 1 && y == m - 1) {
                minx = Math.min(minx, sumx + mapx[x][y]);
                return;
            }
            if (x >= n || y >= m) return;
            dfs(x + 1, y, sumx + mapx[x][y]);
            dfs(x, y + 1, sumx + mapx[x][y]);
        }

        public int minPathSum(int[][] grid) {
            if (grid == null) return 0;
            n = grid.length;
            m = grid[0].length;
            minx = Integer.MIN_VALUE;
            mapx = grid;
            dfs(0, 0, 0);
            return minx;
        }
    }
}
