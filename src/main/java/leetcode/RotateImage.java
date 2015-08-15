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
            int mid = n / 2;
            for (int i = 0; i < n / 2; ++i) {
                for (int j = 0; j < n / 2; ++j) {
                    tmp = matrix[i][j];
                    matrix[i][j] = matrix[n - 1 - j][i];
                    matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                    matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                    matrix[j][n - 1 - i] = tmp;
                }
            }
            if ((n & 1) > 0) {//当行列数为奇数时

                for (int i = 0; i <= mid; ++i) {
                    tmp = matrix[i][mid];
                    matrix[i][mid] = matrix[mid][i];
                    matrix[mid][i] = matrix[n - 1 - i][mid];
                    matrix[n - 1 - i][mid] = matrix[mid][n - 1 - i];
                    matrix[mid][n - 1 - i] = tmp;
                }
            }
            return;
        }
    }
}
