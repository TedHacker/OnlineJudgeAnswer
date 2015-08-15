package leetcode;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/merge-sorted-array/
 */
public class MergeSortedArray {
    public class Solution {
        public void merge(int A[], int m, int B[], int n) {
            int lena = A.length;
            int idx = lena - 1;
            for (; m > 0 && n > 0; ) {
                if (A[m - 1] > B[n - 1]) {
                    A[idx] = A[m - 1];
                    --idx;
                    --m;
                } else {
                    A[idx] = B[n - 1];
                    --idx;
                    --n;
                }
            }
            for (; n > 0 && idx >= 0; ) {
                A[idx] = B[n - 1];
                --idx;
                --n;
            }
        }
    }
}
