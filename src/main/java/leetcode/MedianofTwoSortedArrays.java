package leetcode;

import java.util.Arrays;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/median-of-two-sorted-arrays/
 */
public class MedianofTwoSortedArrays {
    public class Solution {
        private double findx(int A[], int m, int B[], int n, int k) {
            if (m > n) return findx(B, n, A, m, k);
            if (m == 0)
                return B[k - 1];
            if (k == 1)
                return Math.min(A[0], B[0]);
            int tempA = Math.min(k / 2, m);
            int tempB = k - tempA;
            if (A[tempA - 1] > B[tempB - 1])
                return findx(A, m, Arrays.copyOfRange(B, tempB, B.length), n - tempB, k - tempB);
            else if (A[tempA - 1] < B[tempB - 1])
                return findx(Arrays.copyOfRange(A, tempA, A.length), m - tempA, B, n, k - tempA);
            else
                return A[tempA - 1];
        }

        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int m = nums1.length;
            int n = nums2.length;
            int len = m + n;
            if (len % 2 == 0)
                return (findx(nums1, m, nums2, n, len / 2) + findx(nums1, m, nums2, n, len / 2 + 1)) / 2;
            else
                return findx(nums1, m, nums2, n, len / 2 + 1);
        }
    }
}
