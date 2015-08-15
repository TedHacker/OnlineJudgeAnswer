package leetcode;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/sort-colors/
 */
public class SortColors {
    public class Solution {
        public void sortColors(int[] A) {
            int a = 0, b = 0;
            int len = A.length;
            for (int i = 0; i < len; ++i) {
                if (A[i] == 0) ++a;
                else if (A[i] == 1) ++b;
            }
            for (int i = 0; i < a; ++i) A[i] = 0;
            for (int i = a; i < a + b; ++i) A[i] = 1;
            for (int i = a + b; i < len; ++i) A[i] = 2;
        }
    }
}
