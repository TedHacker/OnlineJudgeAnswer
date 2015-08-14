package leetcode;

/**
 * Created by qinjuntao on 2015/8/14.
 * https://leetcode.com/problems/rotate-image/
 */
public class RotateImage {
    public class Solution {
        public void rotate(int[][] matrix) {
            if (matrix == null) return;
            int tmp;
            int n = matrix.length;
            for (int i = 0; i < n / 2; ++i) {
                for (int j = 0; j < n / 2; ++j) {
                    tmp = matrix[i][j];
                    matrix[i][j] = matrix[n - 1 - i][j];
                    matrix[n - 1 - i][j] = matrix[n - 1 - i][n - 1 - j];
                    matrix[n - 1 - i][n - 1 - j] = matrix[i][n - 1 - j];
                    matrix[i][n - 1 - j] = tmp;
                }
            }
            return;
        }
    }
}
