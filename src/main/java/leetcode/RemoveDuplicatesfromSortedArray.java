package leetcode;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicatesfromSortedArray {
    public class Solution {
        public int removeDuplicates(int[] A) {
            if (A == null || A.length == 0) return 0;
            if (A.length == 1) return 1;
            int a = 0, b = 0;
            int len = A.length;
            for (; b < len; ) {
                for (; b < len && A[a] == A[b]; ++b) ;
                if (b < len && A[a] != A[b]) {
                    ++a;
                    A[a] = A[b];
                }
            }
            return a + 1;
        }
    }
}
